
import java.util.ArrayList;

public class BSTBasics {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public  static Node insert(Node root, int data){
        if(root == null){
            return new Node(data);
        }

        if(root.data > data){
            root.left = insert(root.left, data);
        }else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public static boolean search(Node root, int data){
        if (root == null){
            return false;
        }
        if(root.data == data){
            return true;
        }

        if(root.data > data){
            return search(root.left, data);
        }else{
            return search(root.left, data);
        }
    }

    static Node delete(Node root, int data){
        if(root.data > data){
            root.left = delete(root.left, data);
        }else if(root.data < data){
            root.right = delete(root.right, data);
        }else{
            //case 1 - leaf node
            if(root.left == null && root.right == null) {
                return null;
            }

            //case 2 - 1 child node
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            //case 3 - 2 childs
            Node IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
            
        }
        return root;
    }

    static void printInRange(Node root, int k1, int k2){

        if(root == null) return;

        
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            printInRange(root.right, k1, k2);
        }
        else if(root.data > k2){ 
            printInRange(root.left, k1, k2);
        }
        else{
            printInRange(root.right, k1, k2);
        }

    }

    static Node inorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }

    static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size()  ; i++){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("Null");
    }

    static void printPathOfRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);

        }

        printPathOfRoot2Leaf(root.left, path);
        printPathOfRoot2Leaf(root.right, path);

        path.remove(path.size() - 1);
    }

    static boolean isValidBST(Node root, Node min, Node max){
        if(root == null) return true;

        if(min != null && root.data <= min.data){
            return false;
        }
        else if(max != null && root.data >= max.data) {
            return false;
        }

        return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
    
    }

    static Node MirrorBST(Node root){
        if(root == null) return null;

        Node leftMirror = MirrorBST(root.left);
        Node rightMirror = MirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    
    public static void inorder(Node root){
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void preorder(Node root){
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        int data[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root = null;

        for(int i=0 ; i<data.length; i++){
            root = insert(root, data[i]);
        }

        // inorder(root);
        // System.out.println();
        //System.out.println("is found : "+search(root, 10));
        // root = delete(root, 7);
        // inorder(root);

        // System.out.println("In range from 2-5 : ");
        // printInRange(root, 2, 5);

        // printPathOfRoot2Leaf(root, new ArrayList<>());
        // System.out.println(isValidBST(root, null, null));
        
        System.out.println("preorder before : ");
        preorder(root);

        root = MirrorBST(root);
        System.out.println();

        System.out.println("preoder after : ");
        preorder(root);

        


        
    }
}