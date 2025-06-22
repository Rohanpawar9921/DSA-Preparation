
import java.util.ArrayList;

public class a_GraphBasics {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s; 
            this.dest = d;
            this.wt = w;
        } 
    }
    public static void main(String[] args) {
        int v = 5;

        @SuppressWarnings("unchecked") //not any use, just to remove yellow line, comes due to linear and generics data structures dont work perfectly with each other and can threat the cotent safety
        ArrayList<Edge>[] graph = new ArrayList[v];

        for(int i=0; i<v; i++) {
            graph[i] = new ArrayList<>();
        }

        //vertex 0
        graph[0].add(new Edge(0, 1, 5));

        //vertes 1
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 2));

        //vertex 2
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        //vertex 3
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        //vertex 4
        graph[4].add(new Edge(4, 2, 2));

        //2's neighbours
        for(int i=0; i<graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.dest);
        }
    }
}