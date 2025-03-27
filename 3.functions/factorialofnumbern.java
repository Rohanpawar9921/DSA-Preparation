
import java.util.Scanner;

public class factorialofnumbern {

    public static int factorial(int n) {
        int factorial = 1;
        for (int i=n; i>0 ; i--){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which the factorial to be printed : ");
        int n = sc.nextInt();
        System.out.println("the factorial is : "+factorial(n));
    }
}
