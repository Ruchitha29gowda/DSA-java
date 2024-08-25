import java.util.ArrayList;
import java.util.PriorityQueue;

public class ConnectingCiitiesWithMinimumCost {
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
        int v;
        int cost;
        Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair p1){
            return this.cost - p1.cost;
        }
        
    }

    public static void create(ArrayList<Edge>[] graph, int[][] cities){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<cities.length; i++){
            for(int j=0; j<cities.length; j++){
                if(cities[i][j]!=0){
                    graph[i].add(new Edge(i, j, cities[i][j]));
                }
            }
        }
    }


    public static void connectCities(ArrayList<Edge>[] graph){
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        boolean vis[] = new boolean[graph.length];
        int finalCost =0;

        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                finalCost+=curr.cost;
                for(int i=0; i<graph[curr.v].size(); i++){
                    Edge e = graph[curr.v].get(i);
                    if(!vis[e.dest]){
                        pq.add(new Pair(e.dest, e.wt));
                    }
                }
            }
        }

        System.out.println(finalCost);
    }



    public static void main(String[] args) {
        int[][] cities={
            {0,1,2,3,4},
            {1,0,5,0,7},
            {2,5,0,6,0},
            {3,0,6,0,0},
            {4,7,0,0,0}
        };
        ArrayList<Edge>[] graph = new ArrayList[cities.length];

        create(graph, cities);
        connectCities(graph);
    }
}
