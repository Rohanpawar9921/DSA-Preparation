
import java.util.ArrayList;

public class LowestCommonAncestor {
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

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        if(root.data == n ){
            return true;
        }
        path.add(root);

        boolean leftPath = getPath(root.left, n, path);
        boolean rightPath = getPath(root.right, n, path);

        if(leftPath || rightPath){
            return true;
        }
        
        path.remove(path.size() - 1);
        return false;

    }

    public static int LCA (Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        while(i < path1.size() && i < path2.size()){
            if(path1.get(i) != path2.get(i)){
                break;
            }
            i++;
        }

        return path1.get(i-1).data;

    }

    public static Node LCA2(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node LeftCA = LCA2(root.left, n1, n2);
        Node RightCA = LCA2(root.right, n1, n2);

        if(LeftCA == null){
            return  RightCA;
        }
        if(RightCA == null ){
            return  LeftCA;
        }

        return root;

        
    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(LCA(root, 4, 5));
        System.out.println(LCA2(root, 4, 5).data);
        
        
    }
}
