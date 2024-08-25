import java.util.*;

import javax.swing.RowFilter.Entry;

public class DFS {
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
    // 0     | 5---6
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
        graph[5].add(new Edge(5, 6, 1));

        graph[6].add(new Edge(6, 5, 1));

    }
    //PRINT A GRAPH
    public static void printGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].size(); j++){
                System.out.print("{ "+graph[i].get(j).src+ " , " + graph[i].get(j).dest +" , "+graph[i].get(j).wt+" }, ");
            }
            System.out.println();
        }
    }

    public static void dfsUsingStack(ArrayList<Edge>[] graph){
        Stack<Integer> st = new Stack<>();
        boolean[] visited = new boolean[graph.length];
        st.add(0);
        while (!st.isEmpty()) {
            int curr = st.pop();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=graph[curr].size()-1; i>=0; i--){
                    st.push(graph[curr].get(i).dest);
                }
            }
        }
    }

    public static void dfsUsingRecursion(int node){
        if(!visited[node]){
            System.out.print(node+" ");
            visited[node]=true;
            for(int i=0; i<graph[node].size(); i++){
                dfsUsingRecursion(graph[node].get(i).dest);
            }
        }
    }


    public static ArrayList<Edge>[] graph = new ArrayList[7];
    public static boolean visited[] = new boolean[graph.length];
        
    public static void main(String[] args) { 
        // printGraph(graph);
        // dfsUsingStack(graph);
        // System.out.println();
        createGraph(graph);
        dfsUsingRecursion(0);
        
    }
}
