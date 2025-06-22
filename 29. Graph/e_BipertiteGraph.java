
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class e_BipertiteGraph {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
    }
    static boolean isBipartite(ArrayList<Edge> graph[]) {
        int col[] = new int[graph.length];
        for(int i=0; i<graph.length; i++){
            col[i] = -1; //making every node without color
        }

        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i<graph.length; i++) {
            if(col[i] == -1){
                q.add(i);
                col[i] = 0;//default yellow
                while(!q.isEmpty()) { // bfs
                    int curr = q.remove(); 
                    for(int j=0; j<graph[curr].size(); j++) {
                        Edge e = graph[curr].get(j);
                        if(col[e.dest] == -1) { //case 3 -> give color and add to queue
                            int nextCol = col[curr] == 0 ? 1 : 0; //ternay operator
                            col[e.dest] = nextCol;
                            q.add(e.dest);
                        }
                        else if (col[e.dest] == col[curr]) { //case 1 -> not bipertite
                            return false;
                        }
                    }
                }
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        int v = 5;
        
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        System.out.print("is bipertite : ");
        System.out.print(isBipartite(graph));
    }
}
