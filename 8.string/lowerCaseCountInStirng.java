
import java.util.Scanner;

public class lowerCaseCountInStirng {

    public static int countLowercaseVowels(String str){
        int count = 0;
        for (int i = 0 ; i < str.length() ; i++){
            if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'e' ) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string for counting the lowercase vowels : ");
        String str = sc.next();
        System.err.println("There are total "+ countLowercaseVowels(str) + " lowercae vowels in "+str);
    }
}
