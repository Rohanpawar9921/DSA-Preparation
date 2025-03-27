
import java.util.Scanner;

public class findingProductoftwo {

    public static int product(int a , int b) {
        int product = a * b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the first number : ");
        int a = sc.nextInt();
        System.out.print("enter second number : ");
        int b = sc.nextInt();
        System.out.print("product of "+a+" and "+b+ " is : "+product(a, b));
        sc.close();
    }
}
