public class LinkedList{
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;
    
    //adding at first
    public void addFirst(int data){
        size++;
        //step 1 - create newnode
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 - this.next = head
        newNode.next = head;

        //step 3 - head = newnode
        head = newNode;

        
    }

    //adding at last
    public void addLast(int data){
        size++;
        //step 1 - create node
        Node newNode = new Node(data);

        //if head and tail are null
        if(head == null){
            head = tail = newNode;
        }
        //step 2- tail.next = newnode
         tail.next = newNode;
        //step 3 - tail = newwnode
        tail = newNode;
    }

    //print LL
    public static void printLL(){
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null \n");
    }

    public void addAtIndex(int data, int idx){
        if(idx == 0){
            addFirst(data);
            return;
        }
        size++;
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        Node temp = head;
        for(int i=0; i<idx-1; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        
    }

    //remove start
    public int removeStart(){
        if(size == 0){
            System.out.println("linked list is empty");
            return -1;
        }
        else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int value = head.data;
        head = head.next;
        size--;
        return value;
    }

    //remove middle
    public int removeLast(){
        if(size == 0){
            System.out.println("linked list is empty");
            return -1;
        }
        if(size == 1){
            size = 0;
            int value = head.data;
            head = tail = null;
            return value;

        }
        int i = 0;
        Node temp = head;
        while(i < size-2){
            temp = temp.next;
            i++;
        }
        int value = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return value;
    }

    //detecting cycle
    //floyed's cycle finding algorthm
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return  true;
            }
        }
        return false;
    }


    //removing cycle
    public static void removeCycle(){

        //detecting cyle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast= fast.next.next;

            if(slow == fast){
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }

        //meeting point
        slow = head;
        Node prev = null;

        while(slow != fast){
            prev = fast;
            fast = fast.next;
            slow = slow.next;
        }

        //breaking a cycle
        prev.next = null;
    }
    public static void main(String[] args) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;
        //head.next.next.next = head;

        System.out.println(isCycle());

        removeCycle();
        System.out.println(isCycle());
        
        printLL();

    }
}