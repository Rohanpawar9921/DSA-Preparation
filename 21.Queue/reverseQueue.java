
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        int n = q.size();
        for(int i = 0; i<n; i++){
            int top = q.remove();
            System.out.print(top + " ");
            q.add(top);
        }
        System.out.println();

        Stack<Integer> s = new Stack<>();
        for(int i =0; i<n ; i++){
            s.push(q.remove());
        }
        for(int i = 0; i<n; i++){
            q.add(s.pop());
        }

        for(int i = 0; i<n; i++){
            int top = q.remove();
            System.out.print(top + " ");
            q.add(top);
        }


    }
}
