

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeB {
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
    static class BinaryTree {
        static int idx = -1;
        public static Node CreateTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = CreateTree(nodes);
            newNode.right = CreateTree(nodes);

            return  newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }

            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
        public static void levelOrder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
    
            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int height(Node root){
            if(root == null){
                return  0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(rh, lh) + 1;
        }

        public static int countNodes(Node root){
            if(root == null){
                return 0;
            }
            int leftCount = countNodes(root.left);
            int rightCount = countNodes(root.right);

            return leftCount + rightCount + 1;
        }

        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }

            int leftSum = sumOfNodes(root.left);
            int rightSum = sumOfNodes(root.right);

            return leftSum + rightSum + root.data;
        }


        //O(n^2) - inefficiant
        public static int diameter(Node root){
            if(root == null){
                return 0;
            }
            int leftDia = diameter(root.left);
            int rightDia = diameter(root.right);

            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            int selfDia = leftHeight + rightHeight + 1;

            int maxDia = Math.max(selfDia, Math.max(leftDia, rightDia));

            return maxDia;
        }

        //O(n)
        static class Info {
            int dia;
            int ht;

            Info(int dia, int ht){
                this.dia = dia;
                this.ht = ht;
            }
        }
        public static Info diameter2(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter2(root.left);
            Info rightInfo = diameter2(root.right);

            int selfDia = Math.max(leftInfo.ht + rightInfo.ht + 1, Math.max(leftInfo.dia, rightInfo.dia));
            int selfHight = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(selfDia, selfHight);

        }

        

    }

     static boolean isSubTree(Node root, Node subRoot){
        if(root == null){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
    }

     static boolean isIdentical(Node node, Node subRoot) {
        if(node == null && subRoot == null){
            return true;
        }
        else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }

        if(!isIdentical(node.right, subRoot.right)){
            return false;
        }

        return true;
    }
    

    public static void main(String[] args) {
        // int nodes[] = {1, 2 ,4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        // BinaryTree tree = new BinaryTree();
        // Node root = tree.CreateTree(nodes);
        // System.out.println("root is : "+ root.data);

        // System.out.println("Traverals are : ");

        // tree.preorder(root);
        // System.out.println();

        // tree.inorder(root);
        // System.out.println();

        // tree.postorder(root);
        // System.out.println();
        
        // tree.levelOrder(root);
        // System.out.println();

        // System.out.println("height of tree is : "+tree.height(root));
        // System.out.println("total no. of nodes are : "+ tree.countNodes(root));
        // System.out.println("sum of data of all nodes is : "+tree.sumOfNodes(root));
        // System.out.println("Diameter of the tree is( O(n^2) ) : "+tree.diameter(root));
        // System.out.println("Diameter of the tree is ( O(n) ) : "+ tree.diameter2(root).dia);





        // Node root = new Node(1);
        // root.left = new Node(2);
        // root.right = new Node(3);
        // root.left.left = new Node(4);
        // root.left.right = new Node(5);
        // root.right.left= new Node(6);
        // root.right.right = new Node(7);

        // Node subRoot = new Node(2);
        // subRoot.left= new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(isSubTree(root, subRoot));
    }
}