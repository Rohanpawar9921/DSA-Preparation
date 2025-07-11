import java.util.*;
public class j_Dijkstra {
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

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 7));
        
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
    }

    static class Pair implements Comparable<Pair> {
        int n;
        int path; 

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path; //smaller first
        }
    }

    public static void dijkstras (ArrayList<Edge> graph[], int src, int des) {
        int dist[] = new int[graph.length];
        boolean vis[] = new boolean[graph.length];

        //initialize dis
        for(int i=0; i<dist.length;i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        //PQ
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        //BFS
        while(!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.n]) {
                vis[curr.n] = true;

                //neighbours
                for(int i=0; i<graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);

                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;

                    if(dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt; //update
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }

        //print
        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        dijkstras(graph, 0, 5);
    }
}