public class balanceBST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static Node balencedBST (int start, int end, int[] arr){
        if(start > end) return null;

        int mid = (start + end) / 2;
        Node root = new Node(arr[mid]);

        root.left = balencedBST(start, mid-1, arr);
        root.right = balencedBST(mid+1, end, arr);

        return root;
    }

    static void inorder(Node root) {
        if(root == null) {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int tree[] = {3, 5, 6, 8, 10, 11, 12};
        Node root = balencedBST(0, tree.length-1, tree);
        inorder(root);
        

        


    }
}
