
import java.util.Scanner;

public class swapNumbers {
    public static void swapNumber(int num1, int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("new value of a is "+ num1);
        System.out.println("new value of b is "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        swapNumber(a, b); 
    }
}
