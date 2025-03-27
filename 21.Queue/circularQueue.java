public class circularQueue {
    public static class Queue {
        private int[] arr;
        private int front;
        private int rear;
        private int size;

        public Queue(int n) {
            arr = new int[n];
            front = 0;
            rear = -1;
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == arr.length;
        }

        public void enqueue(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % arr.length; // Circular increment
            arr[rear] = data;
            size++;
        }

        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is already empty");
                return -1;
            }
            int frontVal = arr[front];
            front = (front + 1) % arr.length; // Circular increment
            size--;

            // Reset front and rear when queue becomes empty
            if (size == 0) {
                front = 0;
                rear = -1;
            }

            return frontVal;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);

        System.out.println(q.peek()); // Should print 1

        q.dequeue();

        while (!q.isEmpty()) {
            System.out.println(q.dequeue());
        }
    }
}
