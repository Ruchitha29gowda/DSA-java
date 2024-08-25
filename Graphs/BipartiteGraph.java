import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BipartiteGraph {

    public static class  Edge {
        int src;
        int dest;

        Edge(int src,int dest){
            this.src = src;
            this.dest = dest;
        }
        
    }
    //diagram in notes
    //   0----2 
    //  /    /  
    // 1    4   
    //  \ /    
    //   3
    public static void createNonBipartite(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 4));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));

    }

    
    //diagram in notes
    //   0----2 
    //  /    /  
    // 1    /  
    //  \  /    
    //   3
    public static void createBipartite(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 3));
        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 2));


    }

    
    
    
    public static boolean isBipartite(ArrayList<Edge>[] graph, int[]  color){
        for(int i=0; i<graph.length; i++){
            if(color[i]==-1){
                if(isBipartiteUtil(graph , color, i) == false) return false;
            }
        }

        return true;
    }


    public static boolean isBipartiteUtil(ArrayList<Edge>[] graph, int[]  color, int node){
        
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        color[node] = 0;

        while(!q.isEmpty()){
            int curr = q.remove();
            for(int i=0; i<graph[curr].size(); i++){

                //CASE 1: color of parent and child is same
                if(color[graph[curr].get(i).dest] == color[curr]) return false; 

                //CASE 2: child was never visited
                else if(color[graph[curr].get(i).dest] ==-1){
                    q.add(graph[curr].get(i).dest);

                    color[graph[curr].get(i).dest] = color[curr]==0? 1 : 0;
                }

                //CASE 1: color of parent and child is different
                else if(color[graph[curr].get(i).dest] != color[curr]){
                    continue;
                }
            }
        }

        return true;
    }


    public static void main(String[] args) {
        int V = 5;  //for non bipartite graph 
        // int V = 4; //for bipartite graph

        ArrayList<Edge>[] graph = new ArrayList[V];
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        createNonBipartite(graph);
        // createBipartite(graph);


        int[] color = new int[V];
        //-1 = no color
        // 0 = yellow color
        // 1 = blue color
        for(int i=0; i<color.length; i++){
            color[i]=-1; //initialize with -1
        }
        System.out.println(isBipartite(graph , color));
        for(int i=0; i<color.length; i++){
            System.out.print(color[i]+" ");
        }

    }
}
