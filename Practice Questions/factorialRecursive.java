public class factorialRecursive {
    public static int factorial (int n, int res) {
        if(n == 0) {
            return res;
        }

        res = res * n;

        return factorial(n-1, res);
    }
    public static void main(String[] args) {

        System.out.println(factorial(5, 1));
        
    }
}
