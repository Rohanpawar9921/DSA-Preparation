import java.util.*;
public class l_PrimsAlgo {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    public static void CreateGraph(ArrayList<Edge> graph[]) {
        for (int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
    }

    static class Pair implements Comparable<Pair>{
        int ver;
        int cost;

        public Pair (int v, int c) {
            this.ver = v;
            this.cost = c;
        }

        @Override
        public int compareTo(Pair P2){
            return this.cost - P2.cost;
        }
    }
    public static void prims (ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!vis[curr.ver]) {
                vis[curr.ver] = true;
                finalCost += curr.cost;

                for(int i=0; i<graph[curr.ver].size(); i++) {
                    Edge e = graph[curr.ver].get(i);
                    pq.add(new Pair(e.des, e.wt));

                }
            }
        }
        System.out.println(finalCost);
    }
    public static void main(String[] args) {
        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];
        CreateGraph(graph);
        prims(graph);
    }
}
