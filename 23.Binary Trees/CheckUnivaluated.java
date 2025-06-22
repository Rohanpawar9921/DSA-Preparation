import java.util.ArrayList;

public class CheckUnivaluated {
    static public class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static boolean check(Node root, ArrayList<Integer> arr){
        if(root == null) return false;
        
        if(arr.contains(root.data)){
            return true;
        }else{
            arr.add(root.data);
        }
        boolean left = check(root.left, arr);
        boolean right = check(root.right, arr);

        if(left || right){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(8);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println(check(root, arr));
    }
}
