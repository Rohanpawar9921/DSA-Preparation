
import java.util.ArrayList;
import java.util.Stack;

public class stackBasic {
    public static class stack {
        ArrayList<Integer> list = new ArrayList<>();

        //isEmpty
        public boolean isEmpty(){
            return list.size() == 0;
        }

        //peek
        public int peek(){
            return list.get(list.size() - 1);
        }

        //push
        public void push(int data){
            list.add(data);
        };

        //pop
        public int pop(){
            int value = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return value;
        }

        
    }
    public static void main(String[] args) {
        Stack s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.isEmpty());

        System.out.println(s.peek());
        
        s.pop();

        System.out.println(s.peek());

        
    }
}