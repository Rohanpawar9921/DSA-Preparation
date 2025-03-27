

import java.util.Stack;

public class reverseStack {
    public static void pushBottom(Stack<Integer>s, int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);
    }
    public static void reverseAStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        //kam
        int top = s.pop();
        reverseAStack(s);
        pushBottom(s,top);
    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop() +", ");
        }
    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        printStack(s);

        reverseAStack(s);

        printStack(s);
        

        
    }
}
