public class mergeSortInLL {

    //merge sort and zigzag linked list problem
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
        
        //adding at last
    public void addLast(int data){
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
    public void printLL(){
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

    //merge sort on Linked List
    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;

    }
    public Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;
        }
        //kam
        Node mid = getMid(head);
        Node RightHead = mid.next;
        mid.next = null;

        //call
        Node LeftHead = mergeSort(head);
        RightHead = mergeSort(RightHead);

        //return
        return merge(LeftHead, RightHead);

    }
    
    //zig-zag linkedList

    public void zigZag(){
        //find mid
        Node slow = head;
        Node fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse second half

        Node curr = mid.next;
        mid.next = null;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;

        //zig-zag making
        Node nextL, nextR;

        while(left != null && right != null){
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            right = nextR;
            left = nextL;
        }
    }
    public static void main(String args[]){
        mergeSortInLL ll = new mergeSortInLL();
        ll.addLast(1);
        ll.addLast(4);
        ll.addLast(2);
        ll.addLast(5);
        ll.addLast(3);

        ll.printLL();

        ll.mergeSort(head);

        ll.printLL();

        ll.zigZag();

        
        ll.printLL();
    }
}
