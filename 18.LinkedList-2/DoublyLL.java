public class DoublyLL {
    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;


    //add first
    public void addStart(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            tail = head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }


    //remove first
    public void removeFirst(){
        if(head == null){
            System.out.println("dll is empty");
           return; 
        }
        size--;
        head = head.next;
        head.prev = null;
    }

    //remove last
    public void removeLast(){
        if(head == null){
            System.out.println("dll is empty");
            return;
        }
        size--;
        tail = tail.prev;
        tail.next = null;
    }

    //print doublyLL
    public void printLL(){
        Node temp = head;
        for(int i = 0; i< size; i++){
            System.out.print(temp.data +" <-> ");
            temp = temp.next;
        }
    }

    //reverse dll

    public void reverseDLL(){
        Node prev = null;
        Node curr = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;
    }
    
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();
        dll.addStart(4);
        dll.addStart(3);
        dll.addStart(2);
        dll.addStart(1);

        dll.printLL();
        System.out.println();

        // dll.removeFirst();

        // dll.printLL();

        // dll.removeLast();
        // System.out.println();

        // dll.printLL();
        dll.reverseDLL();
        dll.printLL();


    }
}
