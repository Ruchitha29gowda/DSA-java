import java.util.ArrayList;
import java.util.Queue;

public class Graph {
    
    public static class  Edge {
        int src;
        int dest;
        int wt;

        Edge(int src,int dest,int wt){
            this.src = src;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {
        int V = 5; //number of nodes
        ArrayList<Edge>[] graph = new ArrayList[V];

        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 5));

        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));


        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 3));
        graph[2].add(new Edge(2, 4, 2));

        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        graph[4].add(new Edge(4, 2, 2));

        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                System.out.print("{ "+graph[i].get(j).src+ " , " + graph[i].get(j).dest +" , "+graph[i].get(j).wt+" }, ");
            }
            System.out.println();
        }

    }
}
