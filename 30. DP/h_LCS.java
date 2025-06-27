public class h_LCS { //subsequence
    public static int LCS(String s1, String s2, int n, int m) {
        if(n == 0 || m == 0) {
            return 0;
        }

        if(s1.charAt(n-1) == s2.charAt(m-1)) {
            return LCS(s1, s2, n-1, m-1) + 1;
        }
        else {
            int ans1 = LCS(s1, s2, n-1, m);
            int ans2 = LCS(s1, s2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }

    public static int LCS2(String s1, String s2, int n, int m, int dp[][] ) {
        if(n == 0 || m == 0) {
            return 0;
        }

        if(dp[n][m] != -1) {
            return dp[n][m];
        } 
        else {
            if(s1.charAt(n-1) == s2.charAt(m-1)) {
                return dp[n][m] = LCS2(s1, s2, n-1, m-1, dp) + 1;
            } else {
                int ans1 = LCS2(s1, s2, n-1, m, dp);
                int ans2 = LCS2(s1, s2, n, m-1, dp);
                return dp[n][m] = Math.max(ans1, ans2);
            }
        }
    }

    public static int LCS3 (String s1, String s2, int n, int m) {
        int dp[][] = new int[n+1][m+1];

        // initialization - row and column are zero (java automatically sets to zero) 

        for(int i=1; i<n+1; i++) {
            for(int j=1; j<m+1; j++) {

                if(s1.charAt(i-1) == s2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }
                else {
                    int ans1 = dp[i-1][j];
                    int ans2 = dp[j][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "ace";
        int n = s1.length();
        int m= s2.length();

        System.out.println("LCS is (by recursion) : "+LCS(s1, s2, n  , m));

        int dp[][] = new int[n+1][m+1];

        for(int i=0; i<n+1; i++) {
            for (int j=0; j<m+1; j++) {
                dp[i][j] = -1;
            }
        } 

        System.out.println("LCS is (by memoization) : "+LCS2(s1, s2, n, m, dp));

        System.out.println("LCS is (by tabulation) : "+LCS2(s1, s2, n, m, dp));

    }
}
