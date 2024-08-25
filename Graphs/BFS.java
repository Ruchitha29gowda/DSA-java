import java.util.*;

import javax.swing.RowFilter.Entry;

public class BFS {
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

    public static void bfs(ArrayList<Edge>[] graph){
        Queue<Integer> q = new ArrayDeque<>();
        boolean visited[] = new boolean[graph.length];
        q.add(0);

        while (!q.isEmpty()) {
            int curr = q.remove();
            if(visited[curr]==false){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0; i<graph[curr].size(); i++){
                    q.add(graph[curr].get(i).dest);
                }
            }
        }
    }



    public static void main(String[] args) {
        int V = 7; //number of nodes
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);
        // printGraph(graph);
        bfs(graph);
        
    }
}
