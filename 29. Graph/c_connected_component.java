// making graph ready to be in distinct format also

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class c_connected_component {
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



    // BFS
    static void BFS (ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++) {
            if(!visited[i]) {
                BFS_Util(graph, visited);
            }
        }    
    }

    static void BFS_Util(ArrayList<Edge> graph[], boolean visited[]) {
        Queue<Integer> q = new LinkedList<>();
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

    // DFS
    static void DFS (ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i< graph.length; i++){
            if(!vis[i]) {
                DFS_Util(graph, i, vis);
            }
        }

    }

    static void DFS_Util (ArrayList<Edge> graph[], int curr, boolean vis[]) {
        System.out.print(curr+" ");
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]) {
                DFS_Util(graph, e.dest, vis);
            }
        }
    }
    
    public static void main(String[] args) {
        int v = 7;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        System.out.print("BFS : ");BFS(graph);
        System.out.println();

        System.out.print("DFS : ");DFS(graph);
        System.out.println();      
    }
}

