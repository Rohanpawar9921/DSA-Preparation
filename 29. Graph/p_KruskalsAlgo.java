import java.util.ArrayList;
import java.util.Collections;

public class p_KruskalsAlgo {
    static class Edge implements Comparable<Edge>{
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt =wt;
        }

        @Override
        public int compareTo(Edge E2) {
            return this.wt - E2.wt;
        }

    }

    static void createGraph(ArrayList<Edge> edges) {
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }

    static int n = 4; //vertices
    static int[] par = new int[n];
    static int[] rank = new int[n];

    static void init() {
        for(int i=0; i<n; i++) {
            par[i] = i;
        }
    }

    static int find(int x) {
        if(x == par[x]) {
            return x;
        }

        return par[x] = find(x); //path compression
    }

    static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }
        else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        }
        else {
            par[parB] = parA;
        }
    }

    static int kruskals(ArrayList<Edge> edges, int V) {
        int minCost = 0;
        int count = 0;

        init();
        Collections.sort(edges);

        for(int i=0; count< V-1; i++) {
            Edge e = edges.get(i);
            int parA = find(e.src);
            int parB = find(e.des);

            if(!(parA == parB)) {
                union(e.src, e.des);
                minCost+= e.wt;
                count++;

            }

        }

        return minCost;
    }


    public static void main(String[] args) {
        ArrayList<Edge> edge = new ArrayList<>();
        createGraph(edge);
        System.out.println(kruskals(edge, n));
    }
}
