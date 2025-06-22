
import java.util.ArrayList;

public class ConvertToBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node (int data){
            this.data = data;
        }
    }

    static void inorderSequence(Node root, ArrayList<Integer> list) {
        if(root == null) return;

        inorderSequence(root.left, list);
        list.add(root.data);
        inorderSequence(root.right, list); 
    }
    static Node balanceBST(ArrayList<Integer> list, int start, int end) {
        if(start > end) return null;
        int mid = (start + end) / 2;
        
        Node root = new Node(list.get(mid));

        root.left = balanceBST(list, start, mid-1);
        root.right = balanceBST(list, mid+1, end);

        return root;
    }
    static Node convert(Node root) {
        ArrayList<Integer> list = new ArrayList<>();

        inorderSequence(root, list);

        root = balanceBST(list, 0, list.size()-1);

        return root;

    }
    static void inorder(Node root){
        if(root == null) return ;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new  Node(10);
        root.right.right = new Node(11);
        root.right.right = new Node(12);

        inorder(root);
        System.out.println();

        root = convert(root);
        

        inorder(root);
    }
}
