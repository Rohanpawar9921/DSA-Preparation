public class k_editDistance {
    public static int editDistance (String s1, String s2) {
        int n= s1.length();
        int m = s2.length();

        int dp[][] = new int[n+1][m+1];

        //initialization 
        for (int i=0; i<n+1; i++){
            for(int j=0; j<m+1; j++) {
                if(i == 0) {
                    dp[i][j] = j;
                }
                if(j == 0) {
                    dp[i][j] = i;
                }
            }
        }

        //bottom up fill
        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {
                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.min(dp[i-1][j-1], Math.min(dp[i][j-1], dp[i-1][j])) + 1; //add, delete, replace respenctivly <- min of them + 1
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "intention";
        String s2 = "execution";


        System.out.println("minimum distance to edit string 1 to string 2 is : "+ editDistance(s1, s2));
    }
}
