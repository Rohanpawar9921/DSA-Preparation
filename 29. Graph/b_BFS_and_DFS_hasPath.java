
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class b_BFS_and_DFS_hasPath {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt =w;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 3, 1));

        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));
 
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    } 

    static void BFS(ArrayList<Edge> graph[]) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);

        while(!q.isEmpty()) {
            int curr = q.remove();
            
            if(! visited[curr]) {
                visited[curr] = true;
                System.out.print(curr+" ");
                for(int i=0; i<graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }

    
    static void DFS (ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                DFS(graph, e.dest, vis);
            }
        }
    }
    static boolean hasPath(ArrayList<Edge> graph[], int src, int dest, boolean vis[]) {
        if(src == dest) return true;

        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int v = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        System.out.print("BFS : ");BFS(graph);
        System.out.println();

        System.out.print("DFS : ");DFS(graph, 0, new boolean[v]);
        System.out.println();

        System.out.print("has path from 0-5 : ");System.out.print(hasPath(graph, 0, 5, new boolean[v]));;
        
    }
}
