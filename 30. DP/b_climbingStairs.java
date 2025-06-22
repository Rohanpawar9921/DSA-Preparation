
import java.util.Arrays;

public class b_climbingStairs {
    //recursion = O(2^n)
    public static int countWays(int n) {
        if(n ==0) {
            return 1;
        }
        if(n<0) {
            return 0;
        }

        return countWays(n-1) + countWays(n-2);


    }

    //memoization = O(n)
    public static int countWaysM(int n, int[] ways) {
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }

        if(ways[n] != -1) {
            return ways[n];
        }

        ways[n] = countWaysM(n-1, ways) + countWaysM(n-2, ways);

        return ways[n];
    }

    // tabulation
    public static int countWaysT (int n) {
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];

    }
    public static void main(String[] args) {
        System.out.println("recursion way: " + countWays(5));

        int n=5;
        int[] ways = new int[n+1];
        Arrays.fill(ways, -1);
        System.out.println("memoization way: " + countWaysM(n, ways));

        System.out.println("tabulation way: "+ countWaysT(n));



    }
}
