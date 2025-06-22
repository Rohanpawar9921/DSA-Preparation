public class primeNumbers {
    public static void main(String[] args) {
        int n = 72;
        for(int i=2; i*i <= n; i++){
            if (n % i == 0){
                System.out.println("not prime");
                return;
            }
        }
        System.out.println("prime");
        
    }
}