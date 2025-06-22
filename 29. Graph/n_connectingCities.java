
import java.util.PriorityQueue;

public class n_connectingCities {
    static class Edge implements Comparable<Edge>{
        int des;
        int cost;

        public Edge (int d, int c)  {
            this.des =d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge E2) {
            return this.cost - E2.cost;
        }
    }

    public static int connectingCities(int [][] cities) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));
        int finalCost = 0;

        while(!pq.isEmpty()) {
            Edge curr = pq.remove();
            if(!vis[curr.des]) {
                vis[curr.des] = true;
                finalCost += curr.cost;

                for(int i=0; i<cities[curr.des].length; i++) {
                    if(cities[curr.des][i] != 0) {
                        pq.add(new Edge(i, cities[curr.des][i]));
                    }
                }
            }
        }
        return finalCost;

    }
    public static void main(String[] args) {
        int cities[][] = {
            {0, 1, 2, 3, 4},
            {1, 0, 5, 0, 7},
            {2, 5, 0, 6, 0},
            {3, 0, 6, 0, 0},
            {4, 7, 0, 0, 0}
        };

        System.out.println(connectingCities(cities));

    }
}
