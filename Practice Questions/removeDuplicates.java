
import java.util.HashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "aabbccdd";
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++) {
            if(!set.contains(str.charAt(i))) {
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }

        System.out.println(sb.toString());
    }
}
