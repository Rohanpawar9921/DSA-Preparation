public class g_rodCutting {
    public static int rodCutting(int[] prices, int[] length, int totRod) {
        int n = prices.length;
        int dp[][] = new int[n+1][totRod+1];

        for(int i=1;i<n+1; i++) {
            for(int j=1; j<totRod+1; j++) {
                if (length[i-1] <= j) {
                    dp[i][j] = Math.max(prices[i-1] + dp[i][j-length[i-1]], dp[i-1][j]); //as this is unbouded type
                }
                else{
                    dp[i][j] = dp[i-1][j];
                } 
            }
        }


        return dp[n][totRod];
    }
    public static void main(String[] args) {
        int totRod = 8;
        int length[] = {1 ,2, 3, 4, 5, 6, 7, 8};
        int prices[] = {1, 5, 8, 9, 10, 17, 17, 20};

        System.out.println(rodCutting(prices, length, totRod));
    }
}
