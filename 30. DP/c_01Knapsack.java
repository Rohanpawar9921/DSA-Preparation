public class c_01Knapsack {
    public static int knapsackRec (int val[], int[] wt, int w, int n) {
        if(w == 0 || n == 0) {
            return 0;
        }

        if(wt[n-1] <= w) {
            //include
            int ans1 = val[n-1] + knapsackRec(val, wt, w-wt[n-1], n-1);
            //exclude
            int ans2 = knapsackRec(val, wt, w, n-1);
            return Math.max(ans1, ans2);
        }
        else {
            return knapsackRec(val, wt, w, n-1);
        }
    }

    //memoization
    public static int knapsackMemo (int val[], int[] wt, int w, int n, int dp[][])  {
        if(w == 0 || n == 0) {
            return 0;
        }

        if(dp[n][w] != -1) {
            return dp[n][w];
        }

        if(wt[n-1] <= w) {
            int ans1 = val[n-1] + knapsackMemo(val, wt, w-wt[n-1], n-1, dp);
            int ans2 = knapsackMemo(val, wt, w, n-1, dp);
            dp[n][w] = Math.max(ans1, ans2);
            return dp[n][w];
        }
        else {
            dp[n][w] = knapsackMemo(val, wt, w, n-1, dp);
            return dp[n][w];
        }
    }

    //tabulation

    public static int knapsackTabu (int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n+1][W+1];

        for(int i=0; i<dp.length; i++) {
            dp[i][0] = 0;
        }

        for(int i=0; i<dp[0].length; i++) {
            dp[0][i] = 0;
        }

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<W+1; j++) {
                int v = val[i-1];
                int w = wt[i-1];

                if(w <= j) {
                    int incPro = v + dp[i-1][j-w];
                    int excPro = dp[i-1][j];
                    dp[i][j] = Math.max(incPro, excPro);
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }

        return dp[n][W];
    }
    public static void main(String[] args) {
        int[] val = {15, 14, 10, 45, 30};
        int[] wt = {2, 5,  1, 3, 4};
        int w = 7;

        System.out.println("recursion way: "+knapsackRec(val, wt, w, val.length));

        int[][] dp = new int[wt.length+1][w+1];
        for(int i=0; i< dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }        
        System.out.println("memoization way : "+knapsackMemo(val, wt, w, val.length, dp));
        System.out.println("tabulation way : "+knapsackTabu(val, wt, w));
    }
}
