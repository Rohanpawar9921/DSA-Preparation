
import java.util.Stack;

public class pushAtBottom {
    public static void pushBottom(Stack<Integer> s, int data){
        if(s.isEmpty()){
            s.add(data);
            return;
        }
        //kam
        int top = s.pop();
        pushBottom(s, data);
        s.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(2);
        s.push(1);

        pushBottom(s, 4);

        while(!s.isEmpty()){
            System.out.print(s.pop() + ", ");
        }
    }
}
