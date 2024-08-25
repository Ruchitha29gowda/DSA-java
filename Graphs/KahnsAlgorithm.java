import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//USING DFS
public class KahnsAlgorithm {
    public static class  Edge {
        int src;
        int dest;

        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
    }

    // 5----->0<-----4
    // |             |
    // |             |
    // \/            \/
    // 2----->3----->1
    public static void createGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        // graph[0].add(new Edge(0, 2)); //no where
        // graph[1].add(new Edge(1, 0)); //no where

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 0));
        graph[4].add(new Edge(4, 1));

        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));

    }

    public static void kahnAlgo_TopSort(ArrayList<Edge>[] graph){
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> ans = new LinkedList<>();
        int[] indegree = new int[graph.length];

        //calculate indegree of each node
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                indegree[graph[i].get(j).dest] +=1;
            }
        }

        //add the initial points with indegree = 0 in queue
        for(int i=0; i<indegree.length; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        System.out.println(q);

        //BFS
        while (!q.isEmpty()) {
            int curr = q.remove();
            ans.add(curr);
            for(int i=0; i<graph[curr].size(); i++){
                indegree[graph[curr].get(i).dest]-=1;
                if(indegree[graph[curr].get(i).dest]==0){
                    System.out.println(q);
                    q.add(graph[curr].get(i).dest);
                } 
            }
        }

        //print the sequence
        System.out.println(ans);
    }
    
    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        kahnAlgo_TopSort(graph);

    }

}
