public class LinkedList {
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
    public static void addFirst(int data){
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
    public static void addLast(int data){
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

    public static void addAtIndex(int data, int idx){
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
    public static int removeLast(){
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

    //iterative search
    public int searchIterative(int target){
        Node temp = head;
        int count = 0;
        for(int i=0; i<size ; i++){
            if(temp.data == target){
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;

    }
    //recursive search
    public int recursiveSearch(int target, Node head, int count){
        //base case
        if(head == null || (head.next == null && head.data != target)){
            return -1;
        }
        //kam
        if(head.data == target){
            return count;
        }
        //recursive call
        return recursiveSearch(target, head.next, ++count);
    }

    //reversing a LinkedList
    public void reverseLL(){
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    //find and remove nth node from end
    public void findAndRemoveNthFromEnd(int n) {
        if(n == size){
            head = head.next;
            return;
        }
        int toRemove = size - n;
        Node curr = head;
        int count = 1;
        
        while(count < toRemove){
            curr = curr.next;
            count++;
        }
        curr.next = curr.next.next;
    }



    //pelindromecheck
    //slow-fast method -> finding mid
    public Node findMid(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    //check
    public boolean checkPalindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }
        //find mid
        Node mid = findMid();
        //reverse second half
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node left = head;
        Node right = prev;
        //check
        while(right != null){
            if(right.data != left.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;

    }


    public static void main(String[] args) {

        LinkedList LL = new LinkedList();

        printLL();

        addFirst(2);
        printLL();
        addFirst(1);

        printLL();

        addLast(3);
        printLL();
        addLast(4);

        printLL();

        addAtIndex(5, 2);

        printLL();
        System.out.println(size);

        LL.removeStart();
        printLL();

        removeLast();
        printLL();

        System.out.println(LL.searchIterative(3));
        System.out.println(LL.recursiveSearch(3,head,  0));

        LL.reverseLL();
        printLL();

        LL.findAndRemoveNthFromEnd(2);
        printLL();

        System.out.println(LL.checkPalindrome());
        addLast(3);
        System.out.println(LL.checkPalindrome());

        
    }
}