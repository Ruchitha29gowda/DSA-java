import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    // 0-----2
    // | \   |
    // |   \ |
    // 1-----3


    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
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

    public static class Pair implements Comparable<Pair> {
        int node ;
        int cost;

        Pair(int node, int cost){
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p){
            return this.cost - p.cost;
        }
        
    }
    public static void prim(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        int finalCost = 0;

        pq.add(new Pair(0, 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            
            if(!vis[curr.node]){
                System.out.println(curr.node+"-->"+finalCost+" + "+curr.cost);
                finalCost+=curr.cost;
                vis[curr.node] = true;
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge e = graph[curr.node].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println(finalCost);

    }
    
    public static void main(String[] args) {
        int V =4;
        ArrayList<Edge>[] graph = new ArrayList[V]; 
        createGraph(graph);
        prim(graph);

    }
}
