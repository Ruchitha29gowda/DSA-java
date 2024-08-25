import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    public static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int src, int dest, int wt){
            this.src =src;
            this.dest = dest;
            this.wt = wt;
        }
        
    }
    public static class Pair {
        int node, cost,  stops;
        Pair(int node, int cost, int stops){
            this.node = node;
            this.cost = cost;
            this.stops = stops;
        }
        
    }
    public static void finCheapestFlights(int[][] flights,  ArrayList<Edge>[] graph, int src, int dest, int k
    ){
        int[] distance = new int[graph.length];
        for(int i=0; i<distance.length; i++){
            if(i!=src)distance[i] =  Integer.MAX_VALUE;
        }

        Queue<Pair> pq = new LinkedList<>();
        pq.add(new Pair(0,0 ,0 ));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if(curr.stops>k) break;

            for(int i=0; i<graph[curr.node].size(); i++){
                Edge e = graph[curr.node].get(i);
                if(curr.cost+e.wt <distance[e.dest] && curr.stops<=k){

                    distance[e.dest]= curr.cost+e.wt;

                    pq.add(new Pair(e.dest, distance[e.dest], curr.stops+1));
                }
            }
        }

        if(distance[dest]==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else System.out.println(distance[dest]);
    }


    public static void main(String[] args) {
        // int[][] flights = {{0,1,100}, {1,2,100},{2,0,100},{1,3,600},{2,3,200}};
        int[][] flights = {{0,1,2}, {1,2,1}, {2,0,10}};
        int n=3;
        int src =1;
        int dest = 2;
        int k=1;
        
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<flights.length; i++){
            int source = flights[i][0];
            int destination = flights[i][1];
            int wt = flights[i][2];

            Edge e = new Edge(source, destination, wt);
            graph[source].add(e);
        }


        finCheapestFlights(flights, graph, src, dest, k);
    }
}
