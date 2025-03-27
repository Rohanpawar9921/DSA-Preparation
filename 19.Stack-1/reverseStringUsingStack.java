import java.util.Stack;

public class reverseStringUsingStack {
    public static String reverseString(Stack<Character> s, String str){
        int i = 0;
        while(str.length() > i){
            s.push(str.charAt(i));
            i++;
        }
        str = "";
        while(!s.isEmpty()){
            str += s.pop();
        }
        return str;
    }
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();

        String str = "abc";

        System.out.println(reverseString(s, str));
    }
}
