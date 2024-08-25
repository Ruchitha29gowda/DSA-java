public class DiagonalSum {
    //MY LOGIC
    public static void printDiagonal(int matrix[][]){
        //sum of primary diagonal
        int pm=0;
        for(int i=0; i<matrix.length; i++){
            pm+=matrix[i][i];
        }

        int sc=0;
        for(int i=0; i<matrix.length; i++){
            if(matrix.length-i-1 == i){
                continue;
            }
            sc+=matrix[matrix.length-i-1][i];
        }

        System.out.println(pm);
        System.out.println(sc);

        System.out.println(sc+pm);
    }

    // APNA COLLEGE
    public static void printdiagonalsum(int mat2[][]){
        int pm=0;
        int sc=0;
        for(int i=0; i<mat2[0].length;i++){
            pm+=mat2[i][i];
            if(mat2.length-1-i != i){  
                sc+=mat2[mat2.length-1-i][i];
            }
        }
        System.out.println(sc+pm);
    }
    public static void main(String[] args) {
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int mat2[][]={
            {1,2,3},
            {4,0,6},
            {7,8,9}
        };

        // printDiagonal(mat2);
        printdiagonalsum(mat2);

        // printDiagonal(matrix);
    }
}
