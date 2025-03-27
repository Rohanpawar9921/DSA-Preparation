import java.util.Stack;

public class validParentheses {
    public static void main(String[] args) {
        String str = "[(){}{}]";  // Example input
        
        if (isValid(str)) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }
    }

    public static boolean isValid(String str) {
        Stack<Character> s = new Stack<>();

        for (char curr : str.toCharArray()) {
            if (curr == '(' || curr == '{' || curr == '[') {
                s.push(curr);
            } else {
                if (s.isEmpty()) return false; // If no matching opening bracket, invalid
                char top = s.peek();

                if ((curr == ')' && top == '(') ||
                    (curr == '}' && top == '{') ||
                    (curr == ']' && top == '[')) {
                    s.pop(); // Pop if matching bracket pair
                } else {
                    return false; // Invalid case: mismatch in brackets
                }
            }
        }
        return s.isEmpty(); // Stack should be empty if all brackets matched
    }
}
