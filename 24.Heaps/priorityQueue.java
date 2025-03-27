import java.util.*;

public class priorityQueue {
    static class student implements Comparable<student> {
        String name;
        int rank;

        public student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public  int compareTo(student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<student> pq = new PriorityQueue<>(Comparator.reverseOrder()); //by default it give max priority to min value, but this line reverses this

        pq.add(new student("a", 2));
        pq.add(new student("b", 11));
        pq.add(new student("c", 1));
        
        // System.out.println(pq.remove());

        // System.out.println(pq.peek());

        while(!pq.isEmpty()){
            System.out.println(pq.peek().name + " -> "+pq.peek().rank);
            pq.remove();
        }

        
    }
}