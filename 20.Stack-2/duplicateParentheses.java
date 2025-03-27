import java.util.Stack;

public class duplicateParentheses {
    public static boolean duplicate(Stack<Character> s, String str){
        for (int i= 0; i < str.length() ; i++){
            char curr = str.charAt(i);
            if(curr == ')'){
                int count = 0;
                while(s.peek() != '('){
                    s.pop();
                    count++;
                }
                if(count == 0){
                    return true;
                }else{
                    s.pop();
                }
                
            }else{
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "(((a+b) * (c+d)))";
        Stack<Character> s = new Stack<>();

        System.out.println(duplicate(s, str));

        

    }
}
