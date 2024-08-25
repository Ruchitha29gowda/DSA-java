import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class cycleInDirectedGraoh {
    public static class  Edge {
        int src;
        int dest;

        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 3));

    }


    public static boolean isCyclic(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] st = new boolean[graph.length];

        for(int i=0; i<graph.length; i++){
            if(!vis[i]){
                if(isCyclicUtil(graph, vis, st, i)){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCyclicUtil(ArrayList<Edge>[] graph, boolean[] vis,boolean[] st, int curr){
        st[curr] = true;
        vis[curr] = true;

        for(int i=0; i<graph[curr].size(); i++){
            if(st[graph[curr].get(i).dest]){
                return true;
            }
            if(!vis[graph[curr].get(i).dest]){
                if(isCyclicUtil(graph, vis, st, graph[curr].get(i).dest)){
                    return true;
                }
            }
        }
        st[curr] = false;
        return false;
    }

    public static void main(String[] args) {
        int V = 4;

        ArrayList<Edge>[] graph = new ArrayList[V];
       
        createGraph(graph);
        System.out.println(isCyclic(graph));


    }


    

        
}
