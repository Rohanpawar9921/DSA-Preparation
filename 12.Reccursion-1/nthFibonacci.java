public class nthFibonacci {
    static int fibonacci(int n){
        if(n == 1 || n ==0){
            return n;
        }
        int fibonacci = fibonacci(n-1) + fibonacci(n - 2);
        return fibonacci;                       
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(25));
    }
}
