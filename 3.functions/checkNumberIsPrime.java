
import java.util.Scanner;

public class checkNumberIsPrime {

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
        System.out.print("enter the number on which we have to check: ");
        int n = sc.nextInt();
        if (n == 1){
            System.out.print("1 is neither composite or prime !");
        }else if( n == 2) {
            System.out.println("2 is prime !");
        }else {
            int res = isPrime(n);
            if (res == 1) {
                System.out.println("the number "+n+" is prime ,");
            }
            else{
                System.out.println("the number "+n+" is not a prime ,");
            }}
        
    }
    
}
