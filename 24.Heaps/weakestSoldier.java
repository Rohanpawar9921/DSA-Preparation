import java.util.PriorityQueue;

public class weakestSoldier {
    static class Row implements Comparable<Row> {
        int idx;
        int count;

        public Row(int idx, int count){
            this.idx = idx;
            this.count = count;
        }

        @Override
        public int compareTo(Row r2) {
            if(this.count == r2.count){
                return this.idx - r2.idx;
            }
            else {
                return this.count - r2.count;
            }
        }

    }
    public static void main(String[] args) {
        int army[][] = {
            {1, 0, 0, 0},
            {1, 1, 1, 1},
            {1, 0, 0 ,0},
            {1, 0, 0, 0}
        };

        int k=2;

        PriorityQueue<Row> pq = new PriorityQueue<>();
        int count = 0;
        for (int i=0; i<army.length; i++) {
            for (int j=0; j<army[i].length; j++) {
                count += army[i][j];
            }
            pq.add(new Row(i, count));
            count = 0;
        }

        for(int i=0; i< k; i++){
            System.out.print(pq.remove().idx + " ");
        }
    }
}
