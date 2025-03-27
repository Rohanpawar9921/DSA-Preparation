
import java.util.Scanner;

public class binomialCoff {

    public static int fact(int n) {
        int factorial = 1;
        for (int i=n; i>0 ; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static int binomialC(int n, int r) {
        return ((fact(n)) / (fact(r) * fact(n-r)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n :");
        int n = sc.nextInt();
        System.out.print("Enter the valure of r : ");
        int r = sc.nextInt();
        System.out.print("the binomial coeff is : "+binomialC(n, r));
        
    }
}