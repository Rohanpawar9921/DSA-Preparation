public class factorial {
    public static int fact (int n) {
        if (n == 0) {
            return 1;
        }

        
        return n * fact(n-1);
    }

    public static int fact2 (int n ) {
        int dp[] = new int[n+1];

        dp[0] = 1;
        dp[1] = 1;

        for(int i=1; i<=n; i++) {
            dp[i] = i * dp[i-1];
        }

        return dp[n];

    }
    public static void main(String[] args) {
        int n= 5 ;

        System.out.println(fact(n));
        System.out.println(fact2(n));

    }
}