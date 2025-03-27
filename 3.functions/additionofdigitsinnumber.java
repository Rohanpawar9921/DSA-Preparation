
import java.util.Scanner;

public class additionofdigitsinnumber {

    public static int additionOfDigits(int n) {
        int addition = 0;
        while(n > 0){
            int rem = n % 10;
            addition = addition + rem;

            n = n/10;
        }
        return addition;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number to find addition of its digits : ");
        int n = sc.nextInt();
        
        System.out.println("The addition of digits is : "+additionOfDigits(n));

    }
}
