public class RatinMaze {

    public static boolean isSafe(int[][] maze, int x, int y){
        return x<maze.length && x>=0 && y<maze.length && y>=0 && maze[x][y]==1;
    }

    public static boolean rat(int[][] maze, int row, int col, int[][] sol){
        if(row==maze.length-1 && col==maze.length-1 && maze[row][col]==1){
            sol[row][col]=1;
            return true;
        }
        else{
            if(isSafe(maze, row, col)){
                if(sol[row][col]==1) return false;
                else{
                    sol[row][col]=1;
                    if(rat(maze, row+1, col, sol)){
                        return true;
                    }
                    if(rat(maze, row, col+1, sol)==true){
                        return true;
                    }

                    sol[row][col]=0;
                    return false;
                }
            }
            return false;
        }
    }

    public static void printSol(int[][] sol){
        for(int i=0; i<sol.length; i++){
            for(int j=0; j<sol.length; j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println();
        }
    }


    

    public static void main(String[] args) {
        int[][] maze = {
            {1,0,0,0,},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1},
        };
        
        int[][] sol = new int[maze.length][maze.length];
        if(rat(maze, 0, 0, sol)){
            printSol(sol);
        }
        else{
            System.out.println("NO SOLUTION");
        }


    }
}
