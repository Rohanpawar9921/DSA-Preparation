
import java.util.Arrays;

public class anagramsCheck {

    public static void anagrams(String str1 , String str2){
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();

        if (str1.length() == str2.length()){
            char[] str1Array = str1.toCharArray();
            char[] str2Array = str2.toCharArray();

            
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result = Arrays.equals(str1Array, str2Array);
            if (result) {
                System.out.print("anagrams");
            }
            else{
                System.out.print("not an anagram");
            }
        } else {
            System.out.println("not an anagram");
        }
    }
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        anagrams(str1 , str2);
        return;
    }
}
