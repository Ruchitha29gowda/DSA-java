import java.util.ArrayList;

public class ConnectedComponents {
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


    //diagram in notes
    //   1---3 
    //  /    |\
    // 0     | 5   6
    //  \    |/
    //   2---4
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        graph[1].add(new Edge(1, 3, 1));
        graph[2].add(new Edge(2, 4, 1));

        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 5, 1));

        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        graph[6].add(new Edge(6, -1, 1));

    }

    public static void dfs(ArrayList<Edge>[] graph, boolean[] visited){
        for(int i=0; i<graph.length; i++){
            dfsUtil(graph, visited, i);
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int node){
        if(node==-1) return;
        if(!visited[node]){
            visited[node] = true;
            System.out.print(node+" ");
            for(int i=0; i<graph[node].size(); i++){
                dfsUtil(graph, visited, graph[node].get(i).dest);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        boolean[] visited = new boolean[7];

        createGraph(graph);
        dfs(graph, visited);

    }

}
