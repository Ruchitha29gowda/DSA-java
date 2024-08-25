import java.util.ArrayList;

public class AllPathsFromSourceToTarget {
        public static class  Edge {
        int src;
        int dest;

        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    // 5----->0<-----4
    // |      |      |
    // |      |      |
    // \/    \/     \/
    // 2----->3----->1
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 2)); //no where
        // graph[1].add(new Edge(1, 0)); //no where
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void allPaths(ArrayList<Edge>[] graph, String ans, int src, int dest){
        if(src==dest){
            ans+=" "+src;
            System.err.println(ans);
            return;
        }
        for(int i=0; i<graph[src].size(); i++){
            allPaths(graph, ans+" "+src, graph[src].get(i).dest, dest);
        }
        
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        allPaths(graph, "", 5, 1);
    }
}
