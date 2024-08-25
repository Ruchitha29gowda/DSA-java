public class Sudoku {

    public static boolean isSafe(int[][] sudoku, int row, int col, int number){
        //Vertical
        for(int i=0; i<9; i++){
            if(sudoku[i][col]==number) return false;
        }

        //horizontal
        for(int i=0; i<9; i++){
            if(sudoku[row][i]==number) return false;
        }

        //Grid
        int startrow = (row/3)*3;
        int startcol = (col/3)*3;
        for(int i=startrow; i<startrow+3;i++){
            for(int j=startcol; j<startcol+3; j++){
                if(sudoku[i][j]==number) return false;
            }
        }

        return true;
    }
    
    public static boolean sudokuSolver(int[][]sudoku, int row, int col){
        if(row==9 && col==0){
            return true;
        }
        else{
            int nextRow = row;
            int nextCol = col+1;
            if(nextCol==9){
                nextRow=row+1;
                nextCol=0;
            }

            if(sudoku[row][col]!=0){
                return sudokuSolver(sudoku, nextRow, nextCol);
            }

            for(int number=1; number<=9; number++){
                if(isSafe(sudoku, row, col, number)){
                    sudoku[row][col]=number;
                    if(sudokuSolver(sudoku, nextRow, nextCol)){
                        return true;
                    }
                    sudoku[row][col]=0;
                }
            }
            return false;
        }
    }

    public static void printSudoku(int[][] sudoku){
        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] sudoku = {
            {0,0,8,0,0,0,0,0,0},
            {4,9,0,1,5,7,0,0,2},
            {0,0,3,0,0,4,1,9,0},
            {1,8,5,0,6,0,0,2,0},
            {0,0,0,0,2,0,0,6,0},
            {9,6,0,4,0,5,3,0,0},
            {0,3,0,0,7,2,0,0,4},
            {0,4,9,0,3,0,0,5,7},
            {8,2,7,0,0,9,0,1,3},
        };

        int[][] sudoku2 = {
            {0,8,7,6,5,4,3,2,1},
            {2,0,0,0,0,0,0,0,0},
            {3,0,0,0,0,0,0,0,0},
            {4,0,0,0,0,0,0,0,0},
            {5,0,0,0,0,0,0,0,0},
            {6,0,0,0,0,0,0,0,0},
            {7,0,0,0,0,0,0,0,0},
            {8,0,0,0,0,0,0,0,0},
            {9,0,0,0,0,0,0,0,0},
        };

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("EXITS");
            System.out.println("\n\n");
            printSudoku(sudoku);
        }
        else{
            System.out.println("NO SOLUTION");
        }

        // int n = 5;
        // char c = '5';
        // String c2 = ""+n;
        // System.out.println(c2.charAt(0));
    }
}
