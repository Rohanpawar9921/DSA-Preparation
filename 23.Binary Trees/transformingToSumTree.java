public class transformingToSumTree {
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
    public static void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static int transform(Node root){
        if (root == null ){
            return 0;
        }
        int leftSum = transform(root.left);
        int rightSum = transform(root.right);

        

        // Store old value before updating
        int oldValue = root.data;

        // Update current node data to sum of left and right subtree
        root.data = leftSum + rightSum;

        // Return total sum including current node's original value
        return root.data + oldValue;
        
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(4);
        root.left.right.right = new Node(5);
        root.left.right.right.right = new Node(6);

        transform(root);
        inorder(root);
        
    }
}
