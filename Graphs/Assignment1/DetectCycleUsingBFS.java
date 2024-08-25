import java.util.ArrayList;

public class DetectCycleUsingBFS{
    static class Edge {
        int src;
        int dest;

        Edge(int src, int dest){
            this.src =src;
            this.dest = dest;
        }
    }

    
    //diagram in notes
    //   0---3 
    //  /    |
    // 1     |
    //  \    4
    //   2
    public static void createUncyclicGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));


        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[1].add(new Edge(1, 9));
        graph[1].add(new Edge(1, 5));

        graph[2].add(new Edge(2, 5));
        graph[2].add(new Edge(2, 4));

        graph[4].add(new Edge(4, 2));

        graph[5].add(new Edge(5, 1));
        graph[5].add(new Edge(5, 9));

        graph[9].add(new Edge(9, 1));
        graph[9].add(new Edge(9, 5));
    }

    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stk[] = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(detectCycleUtil(graph, vis ,stk, i)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], boolean stk[] , int node){
        vis[node] = true;
        stk[node] = true;

        for(int i=0; i<graph[node].size(); i++){
            int dest = graph[node].get(i).dest;
            if(stk[dest]){
                System.out.println(dest);
                return true;
            }
            if(!vis[dest]){
                if(detectCycleUtil(graph, vis, stk, dest)){
                    return true;
                }
            }
        }
        stk[node] = false;

        return false;
    }

    public static void main(String[] args) {
        int V =5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        // createGraph(graph);  //V=10
        createUncyclicGraph(graph); //V=5

        System.out.println(detectCycle(graph));
    }
}