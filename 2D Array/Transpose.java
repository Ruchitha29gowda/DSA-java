public class Transpose {

    public static void printarray(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void transposeMattrix(int mat[][]){
        int m = mat.length;
        int n=mat[0].length;

        int trans[][]= new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                trans[i][j] =mat[j][i];
            }
        }
        System.out.println("\nTranspose is: ");

        printarray(trans);

    }



    public static void main(String[] args) {
        int matrix[][]= {
            {10,20,30},
            {15,25,35},
            {27,29,37}
        };

        int mat2[][]= {
            {10,20,30},
            {15,25,35},
            {27,29,37},
            {50,60,70}
        };

        printarray(mat2);
        transposeMattrix(mat2);
    }
}
