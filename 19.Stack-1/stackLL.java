public class stackLL {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        //isEmpty
        public boolean isEmpty(){
            return head == null;
        }

        //peek
        public int peek() {
            return head.data;
        }

        //push
        public void push(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop 
        public int pop(){
            if(head == null){
                System.out.println("stack is empty");
                return -1;
            }
            int value = head.data;
            head = head.next;
            return value;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        
        System.out.println(s.isEmpty());

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.isEmpty());

        System.out.println(s.peek());

        System.out.println(s.pop());

        System.out.println(s.peek());

        System.out.println(s.isEmpty());

        while(!s.isEmpty()){
            System.out.print(s.pop() + ", ");
        }
    }
}
