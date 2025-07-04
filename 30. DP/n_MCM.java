import java.util.*;

public class n_MCM {
    
    //recursion
    public static int MCM (int arr[], int i, int j) {
        if (i == j) return 0;

        int ans = Integer.MAX_VALUE;
        for(int k=i; k<= j-1; k++) {
            int cost1 = MCM(arr, i, k);
            int cost2 = MCM(arr, k+1, j);

            int cost = arr[i-1] * arr[k] * arr[j];
            int totalcost = cost + cost1 + cost2;

            ans = Math.min(ans, totalcost);   
        }
        return ans;
    }


    //memoization
    public static int MCM2 (int arr[], int dp[][], int i, int j) {
        if (i == j) return 0;

        if(dp[i][j] != -1) return dp[i][j];

        int ans = Integer.MAX_VALUE;

        for(int k = i; k<= j-1; k++) {
            int cost1 = MCM2(arr, dp, i, k);
            int cost2 = MCM2(arr, dp, k+1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];

            int totalCost = cost1 + cost2 + cost3; 
            ans = Integer.min(ans, totalCost);
        }

        return dp[i][j] = ans;

    }

    //tabulation
    public static int MCM3(int arr[]) {
        int n = arr.length;

        int dp[][] = new int[n][n];

        //initialization
        for(int i=0; i<n; i++) {
            dp[i][i] = 0;
        }

        //bottomup
        for(int len = 2; len <= n-1; len++) {
            for(int i = 1; i<= n-len; i++) {
                int j = i+len-1;
                int ans = Integer.MAX_VALUE;

                for(int k=i; k<=j-1; k++) {
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];

                    dp[i][j] = Math.min(ans, cost1+cost2+cost3);
                }
            }
        }
        return dp[1][n-1];
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 3};
        int n = arr.length;
        System.out.println("mcm by recursion = " + MCM(arr, 1, n-1));

        int dp[][] = new int[n][n];

        for(int i=0; i<n; i++) {
            Arrays.fill(dp[i], -1);
        }

        System.out.println("mcm by memoization = " + MCM2(arr, dp, 1, n-1));

        System.out.println("mcm by tabulation = " + MCM3(arr));
         
    }
}
