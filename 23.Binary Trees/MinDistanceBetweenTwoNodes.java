public class MinDistanceBetweenTwoNodes {
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

    public static int dist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = dist(root.left, n);
        int rightDist = dist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        if(leftDist == -1) {
            return rightDist + 1;
        } else if(rightDist == -1){
            return leftDist + 1;
        }

        return -1;

    }
    public static int minDist(Node root, int n1, int n2){
        Node lca = LCA2(root, n1, n2);
        int dist1 = dist(lca, n1);
        int dist2 = dist(lca, n2);

        return dist1+dist2;

    }
    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(minDist(root, 4, 6));
    }
}
