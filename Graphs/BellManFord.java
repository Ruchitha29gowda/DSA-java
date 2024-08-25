import java.util.ArrayList;

public class BellManFord {

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

    // 0-->1<---------4
    // |   |         /\
    // |   \/         |
    // --->2--------->3


    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));
        graph[1].add(new Edge(1, 2, -4));
        graph[2].add(new Edge(2, 3, 2));
        graph[3].add(new Edge(3, 4, 4));
        graph[4].add(new Edge(4, 1, -1));
    }
    
    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        int src = 0;
        int distance[] = new int[V];
        for(int i=0; i<distance.length; i++){
            if(i!=src) distance[i] = Integer.MAX_VALUE;
        }

        for(int i=0; i<V-1; i++){
            for(int j=0; j<graph.length; j++){
                for(int k=0; k<graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src; 
                    int v = e.dest; 
                    int wt = e.wt;
                    if(distance[u]!=Integer.MAX_VALUE && distance[u]+wt<distance[v]){
                        distance[v] = distance[u] + wt;
                    }
                }
            }
        }

        for(int i=0; i<distance.length; i++){
            System.out.print(distance[i]+"  ");
        }
    }

    
}
