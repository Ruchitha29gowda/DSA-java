import java.util.ArrayList;

public class CycleDetection {
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
    //   0---3 
    //  /    |
    // 1     |
    //  \    4
    //   2
    public static void createUncyclicGraph(ArrayList<Edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 3, 1));

        graph[1].add(new Edge(1, 0, 1));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 1, 1));


        graph[3].add(new Edge(3, 0, 1));
        graph[3].add(new Edge(3, 4, 1));

        graph[4].add(new Edge(4, 3, 1));

    }

    //diagram in notes
    //   1---3 
    //  /    |\
    // 0     | 5   6
    //  \    |/
    //   2---4
    public static void createCyclicGraph(ArrayList<Edge>[] graph){
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


    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[7];

        for(int i=0; i<graph.length; i++){
            if(!visited[i]){
                if(dfsUtil(graph, visited, i, -1)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfsUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int par){
        visited[curr] = true;

        //call for all the neighbours
        for(int i =0; i<graph[curr].size(); i++){
            int neighbour = graph[curr].get(i).dest;

            if(visited[curr] && par == curr) continue;

            if(visited[neighbour] && neighbour!=par){
                return true;
            }

            if(!visited[neighbour]){
                if(dfsUtil(graph, visited, neighbour, curr)){
                    return true;
                }
            }
        }

        return false;
    }


    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[7];
        

        createUncyclicGraph(graph);
        // createCyclicGraph(graph);
        System.out.println(detectCycle(graph));

    }

}
