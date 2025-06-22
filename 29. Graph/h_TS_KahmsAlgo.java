import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class h_TS_KahmsAlgo {
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0 ; i< graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
    }

    public static void indegree(ArrayList<Edge> graph[], int indeg[]) {
        for(int i=0; i<graph.length; i++) {
            for(int j=0; j<graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                indeg[e.des]++;
            }
        }
    }

    public static void topSort(ArrayList<Edge> graph[]) {
        int indeg[] = new int[graph.length];
        indegree(graph, indeg);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<indeg.length; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }

        //BFS
        while(!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");

            for(int i=0; i<graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indeg[e.des]--;
                if(indeg[e.des] == 0) {
                    q.add(e.des);
                }
            }
        }

        System.out.println();


    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        topSort(graph);
    }


}
