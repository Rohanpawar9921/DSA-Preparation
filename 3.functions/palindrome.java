
import java.util.Scanner;

public class palindrome {

    public static boolean isPalindrome(int a) {
        int palindrome = a;
        int reverse = 0;

        while (palindrome != 0){
            int rem = palindrome %10;
            reverse = reverse* 10 + rem;
            palindrome = palindrome / 10;
        }

        if (reverse == a) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number on which we have to check : ");
        int a = sc.nextInt();
        if (isPalindrome(a)) {
            System.out.println("the number is palindrome :");
        }else {
            System.out.print("not a palindrome");
        }
    }
}
