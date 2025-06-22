
import java.util.ArrayList;

public class k_bellmonFord {
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

       graph[1].add(new Edge(1, 2, -4));
       
       graph[2].add(new Edge(2, 3, 2));

       graph[3].add(new Edge(3, 4, 4));

       graph[4].add(new Edge(4, 1, -1));
    }


    public static void bellmonFord (ArrayList<Edge> graph[], int src) { //time complexity = O(VE)
        int dist[] = new int[graph.length];

        for(int i=0; i<dist.length; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        int V = graph.length; 

        //O(V)
        for(int i=0; i<V-1; i++) {
            //O(E)
            for(int j=0 ; j<graph.length; j++) {
                for(int k = 0; k<graph[j].size(); k++) {
                    Edge e = graph[j].get(k);

                    int u = e.src;
                    int v = e.des;
                    int wt = e.wt;

                    //relaxation
                    if(dist[u] != Integer.MAX_VALUE && (dist[u] + wt < dist[v]) ){ //In java/c++ adding something to infinity makes value negative, so infinity case creates problem
                        dist[v] = dist[u] + wt;
                    }
                }
            }
        }

        //print
        for(int i=0; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();


    }

    //simpler version
    public static void createGraph2 (ArrayList<Edge> graph) {
        graph.add(new Edge(0, 1, 2));
        graph.add(new Edge(0, 2, 4));
        graph.add(new Edge(1, 2, -4));
        graph.add(new Edge(2, 3, 2));
        graph.add(new Edge(3, 4, 4));
        graph.add(new Edge(4, 1, -1));
    }

    public static void bellmonFord2 (ArrayList<Edge> graph, int src, int V) {
        int dist[] = new int[V];
        for(int i=0; i<V; i++) {
            if(i != src) {
                dist[i] = Integer.MAX_VALUE;
            } 
        }

        for(int i = 0; i< V-1; i++) {
            for(int j=0; j<graph.size();j++) {
                Edge e = graph.get(j);

                int u = e.src;
                int v = e.des; 
                int wt = e.wt;

                if(dist[u] + wt < dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }

        //print
        for(int i=0 ; i<dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
    }
    
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        ArrayList<Edge> edges = new ArrayList<>();

        createGraph(graph);
        createGraph2(edges);

        bellmonFord(graph, 0);
        bellmonFord2(edges, 0, v);
    }
}