import java.util.Scanner;

public class primeInARange{
    public static int isPrime(int n) {   
        int res = 1;
        for (int i=2; i<=Math.sqrt(n) ; i++) { //important for optimization
            if (n%i == 0) {
                res = 0;
                return res;
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the range :");
        int n = sc.nextInt();
        if (n == 1){
            System.out.print("1 is neither composite or prime !");
        }else if( n == 2) {
            System.out.println("2");
        }else {
            System.out.print("the range of prime numbers is : ");
            for (int i=2 ; i<=n ; i++){
                int res = isPrime(i);
                if (res == 1) {
                    System.out.print(i+", ");
                }
            }
            
        }
    }
}