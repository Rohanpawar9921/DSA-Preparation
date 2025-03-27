
import java.util.Scanner;

public class binaryTodecimal {

    public static int binTodec(int n){
        int pow = 0;
        int decNum = 0;

        while(n > 0) {
            int lastDigit = n % 10;
            decNum =  decNum + lastDigit * (int) Math.pow(2, pow);

            n = n / 10;
            pow++ ;
        }

        return decNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("the decimal form is : "+binTodec(n));
        
    }
}
