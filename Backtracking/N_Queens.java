public class N_Queens {
    static int cnt =0;
    public static void count(int[] count){
        count[0]+=1;
    }

    public static void NqNrow(char[][] c, int row, int[] count){
        if(row==c.length){
            printBoard(c);
            count[0]+=1;
            System.out.println(count[0]);
            cnt++;
            return ;
        }
        for(int i=0; i<c.length; i++){
            if(isSafe(c, row, i)){
                c[row][i]='Q';
                NqNrow(c, row+1, count); //function call
                c[row][i]='x'; //backtracking step
            }
        }

        return ;
    }

    public static boolean isSafe(char[][] c, int row, int col){
        //vertically up
        for(int i=row-1; i>=0; i--){
            if(c[i][col]=='Q'){
                return false;
            }
        }

        //diagonally left up
        for(int i=row-1, j=col-1; i>=0 &&j>=0; i--, j--){
            if(c[i][j]=='Q') return false;
        }

        //diagonally right up
        for(int i=row-1, j=col+1; i>=0 && j<c[0].length; i--, j++){
            if(c[i][j]=='Q') return false;
        }
        return true;
    }


    public static void printBoard(char[][] c){
        System.out.println("--------Chess Board--------");
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n=4;
        int[] count =new int[1];
        char[][] c= new char[n][n];
        for(int i=0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                c[i][j]='x';
            }
        }

        NqNrow(c, 0,count);
        System.out.println(count[0]);

        System.out.println("Static c="+cnt);
    }
}
