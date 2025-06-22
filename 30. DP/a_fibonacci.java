public class a_fibonacci {
    //without dp - inefficient 
    public static int fibonacci1(int x) {
        if(x == 0 || x == 1) {
            return x;
        }
        return fibonacci1(x-1) + fibonacci1(x-2);
    }
    // DP- Memorization
    public static int fibonacci2(int n, int fib[]) {
        if(n == 0 || n == 1) {
            return n;
        }
        if(fib[n] != 0) {
            return fib[n];
        }
        fib[n] = fibonacci2(n-1, fib) + fibonacci2(n-2, fib);
        return fib[n];

    }
    
    //DP - tabulation
    public static int fibonacci3(int n){
        int dp[] = new int[n+1];
        dp[1] = 1;

        for(int i=2; i<= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println("inefficieat : "+fibonacci1(5));

        int fib[] = new int[6];
        System.out.println("efficient (memoization): " + fibonacci2(5, fib) );

        System.out.println("efficiant (tabulation) : "+ fibonacci3(5));
    }
}