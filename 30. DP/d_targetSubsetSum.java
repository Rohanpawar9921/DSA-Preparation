public class d_targetSubsetSum {
    public static boolean  targetSum(int[] arr, int sum) {
        // O(n * sum)
        int n = arr.length;
        int w = sum;
        boolean dp[][] = new boolean[n+1][w+1];

        //if the target sum is 0, then always answer will true as for every subset, null set will add to 0
        for(int i=0; i< n+1 ; i++) {
            dp[i][0] = true;
        }

        for(int i=1; i< n+1; i++) {
            for(int j = 1; j<w+1; j++) {
                int v = arr[i-1];

                //include
                if(v <= j && dp[i-1][j-v] == true) {
                    dp[i][j] = true;
                } 
                else if (dp[i-1][j] == true) { //exclude
                    dp[i][j] = true;
                }
            }
        }

        printDp(dp);
        return dp[n][w];
    }

    public static void printDp (boolean dp[][]) {
        for(int i=0; i<dp.length; i++) {
            for(int j=0; j<dp[0].length; j++) {
                if(dp[i][j] == true) {
                    System.out.print(dp[i][j] + "  | ");
                }
                else {
                    System.out.print(dp[i][j] + " | ");
                }   
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;

        System.out.println("target subset sum exists : "+ targetSum(arr, sum));
    }
}
