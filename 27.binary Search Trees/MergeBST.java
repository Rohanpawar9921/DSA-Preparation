
import java.util.ArrayList;

public class MergeBST {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void inorder (Node root, ArrayList<Integer> list){
        if(root == null) return;

        inorder(root.left, list);
        list.add(root.data);
        inorder(root.right, list);
    }

    public static ArrayList<Integer> mergeList(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        int i = 0;
        int j = 0;
        ArrayList<Integer> list = new ArrayList<>();

        while(i < list1.size() && j < list2.size()){
            if(list1.get(i) < list2.get(j)) {
                list.add(list1.get(i));
                i++;
            }else {
                list.add(list2.get(j));
                j++;
            }
        }
        while(i < list1.size()) {
            list.add(list1.get(i));
            i++;
        }
        while(j < list2.size()) {
            list.add(list2.get(j));
            j++;
        }

        return list;
    }
    public static Node Creat(ArrayList<Integer> list, int start, int end) {
        if(start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(list.get(mid));

         root.left = Creat(list, start, mid-1);
         root.right = Creat(list, mid+1, end);
        return root;
    }
    static void print(Node root) {
        if(root == null ) return;

        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }
    public static void main(String[] args) {

        Node BST1 = new Node(2);
        BST1.left = new Node(1);
        BST1.right = new Node(4);

        Node BST2 = new Node(9);
        BST2.left = new Node(3);
        BST2.right = new Node(12);

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(BST1, list1);
        inorder(BST2, list2);

        ArrayList<Integer> list = mergeList(list1, list2);
        Node root = Creat(list, 0  , list.size()-1);

        System.out.print("BST 1 : ");
        print(BST1);
        System.out.println();

        System.out.print("BST 2 : ");
        print(BST2);
        System.out.println();

        System.out.print("merged BST : ");
        print(root);


        
        
        
    }
}
