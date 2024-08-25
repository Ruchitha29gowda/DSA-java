import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgo {
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

    public static class Pair implements Comparable<Pair> {
        int node;
        int pathWeight;
        Pair(int node, int pathWeight){
            this.node = node;
            this.pathWeight = pathWeight;
        }
        
        @Override
        public int compareTo(Pair p1){
            return this.pathWeight - p1.pathWeight;
        }
    }
 
    // ONLY STRUCTURE AND NOT DIRECTION IS SHOWN IN THE FIGURE
    //      1----------3
    //    / |          | \
    //  /   |          |   \
    //0     |          |     5
    // \    |          |   /
    //  \   |          |  /
    //    \ |          |/
    //      2----------4

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 5, 5));
        graph[4].add(new Edge(4, 3, 2));
    }

    //to print shortest path from source to all ppaths
    public static void dijkstraAlgo(ArrayList<Edge>[] graph, int src){
        int dist[] = new int[graph.length];
        boolean visited[] = new boolean[graph.length];


        for(int i=0; i<dist.length; i++){
            if(i!=src){
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(!visited[curr.node]){
                visited[curr.node] = true;
                for(int i=0; i<graph[curr.node].size(); i++){
                    Edge ed = graph[curr.node].get(i);
                    int u = ed.src;
                    int v = ed.dest;
                    int wt = ed.wt;
                    if(dist[u]+wt < dist[v]){
                        dist[v] = dist[u]+wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }   
        }

        for(int i=0; i<dist.length; i++){
            System.out.print(dist[i]+" ");
        }
    }



    public static void main(String[] args) {
        int numOfNodes = 6;

        ArrayList<Edge>[] graph = new ArrayList[numOfNodes];
        createGraph(graph);
        int src = 0;
        dijkstraAlgo(graph, src);

    }
}
