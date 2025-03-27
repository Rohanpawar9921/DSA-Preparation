import java.util.*;


public class javabasics {

    public static void sumOfTwo(int num1, int num2){ //parameters or formal parameters
        int sum = num1 + num2;
        System.out.print("sum is"+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sumOfTwo(a, b); //argumetes or actual parameters
    }
}
