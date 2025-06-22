import java.util.*;
public class m_cheapestFlightsWithinKStops {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge (int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    public static void createGraph (int flights[][], ArrayList<Edge> graph[]){
        for(int i=0; i< graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for(int i=0 ; i< flights.length; i++) {
            int src = flights[i][0];
            int des = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(src, des, wt);
            graph[src].add(e);
        }
    }

    //Info class
    static class Info {
        int ver;
        int cost;
        int stop;

        public Info (int v, int c, int s) {
            this.ver = v;
            this.cost = c;
            this.stop = s;
        }
    }

    public static int cheapestCost(int flights[][],int src, int des, int k, int n) {
        //create graph
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        //initialize distance
        int dist[] = new int[graph.length];
        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        //Queue
        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        //bfs
        while(!q.isEmpty()) {
            Info curr = q.remove();

            if(curr.stop > k) {
                break;
            }

            for(int i=0; i<graph[curr.ver].size(); i++) {
                Edge e = graph[curr.ver].get(i);
                int u = e.src;
                int v = e.des;
                int wt = e.wt;

                if(curr.cost + wt< dist[v] && curr.stop <= k) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stop + 1));
                }
            }
        }

        if(dist[des] == Integer.MAX_VALUE) {
            return -1;
        }
        else {
            return dist[des];
        }

    }
    public static void main(String[] args) {
        int n = 4;
        int flights[][] = {{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0, des = 3, k = 1;

        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(flights, graph);

        System.out.println("cheapest cost with atmost k stops is : " + cheapestCost(flights, src, des, k, n));
    }
}
