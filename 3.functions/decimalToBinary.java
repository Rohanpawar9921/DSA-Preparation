
import java.util.Scanner;

public class decimalToBinary {

    public static int decTobin(int n){
        int pow = 0;
        int binNum = 0;

        while(n > 0) {
            int rem = n % 2;
            binNum =  binNum + rem * (int) Math.pow(10, pow);

            n = n / 2;
            pow++ ;
        }

        return binNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("the binary form is : "+decTobin(n));
        
    }
}
