
import java.util.Stack;

public class nextGreater {
    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1 ; i>=0; i--){ //if we asked to give next bigger at left side then simply run loop from start to end
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){ //if we asked to put next smallest then simply reverse this condtion
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for(int i = 0; i< nextGreater.length ; i++){
            System.out.print(nextGreater[i] + " ");
        }
    }

    //greater right - same logic
    //greater left - change the direction of for loop
    //smaller right - reverse the condition in the while loop
    //smaller left - change the direction of for loop and reverse the condition in while loop <- both
}
