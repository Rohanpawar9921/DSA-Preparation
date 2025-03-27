public class QueueBasics {
    public static class Queue{
        public static int arr[];
        //public static int front;
        public static int rear;
        public static int size;

        public Queue(int n){
            arr = new int[n];
            rear = -1;
            size = n;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void enque(int data){
            if(rear == size-1){
                System.out.println("Queue is full");
                return;
            }
            
            
            rear = rear + 1;
            arr[rear] = data;
        }

        public int dequeue(){
            if(rear == -1){
                System.out.println("Queue is already empty");
                return -1;
            }
            
            int front = arr[0];
            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }

        public int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args) {

        Queue q = new Queue(3);
        q.enque(1);
        q.enque(2);
        q.enque(3);

        System.out.println(q.peek());

        q.dequeue();

        while(!q.isEmpty()){
            System.out.println(q.dequeue());
        }
        
    }
}