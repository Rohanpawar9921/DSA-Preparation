public class primeNoRecursive {
    public static boolean isPrime(int n, int i) {
        if(n < 2) {
            return false;
        }

        if(n == 2) {
            return true;
        }

        if(n % i == 0) {
            return false;
        }

        if(i*i > n) {
            return true;
        }

        return isPrime(n, i+1);
    } 
    public static void main(String[] args) {
        int n = 17;

        boolean isP = isPrime(n, 2);

        System.err.println(isP);
    }
}
