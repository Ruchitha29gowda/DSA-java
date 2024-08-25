import java.util.ArrayList;
import java.util.List;

public class NQueensleetcode {

    //to save the board in result list
    public static void save(char[][] board, List<List<String>> result){
        List<String> l = new ArrayList<>();
        for(int i=0; i<board.length; i++){
            String s="";
            for(int j=0; j<board.length; j++){
                s+=board[i][j];
            }
            l.add(s);
        }

        result.add(l);
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q') return false;
        }

        //diagonally left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q') return false;
        }

        //diagonally right up
        for(int i=row-1, j=col+1; i>=0&& j<board.length; i--,j++){
            if(board[i][j]=='Q') return false;
        }


        return true;
    }
    
    public static void recSolution(char[][] board, int row, List<List<String>> result){

        if(row==board.length){
            save(board, result);
            printboard(board);
            return;
        }
        else{
            for(int i=0; i<board.length; i++){
                if(isSafe(board, row, i)){
                    board[row][i]='Q';
                    recSolution(board, row+1, result);
                    board[row][i]='.';
                }
            }
        }
    }

    //main function
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j]='.';
            }
        }

        recSolution(board, 0, result);

        return result;
    }

    public static void printboard(char[][] c){
        System.out.println("--------------------");
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c.length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("--------------------");
    }


    public static void main(String[] args) {
        
        System.out.println(solveNQueens(4));
    }
}
