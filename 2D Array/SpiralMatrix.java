public class SpiralMatrix{

    public static void printmatrix(int matrix[][]){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void spiral(int matrix[][]){
        int startrow =0;
        int startcol =0;
        int endrow=matrix.length-1;
        int endcol= matrix[0].length-1;



        while(startcol<=endcol && startrow<=endrow){

            //print top border
            for(int i=startcol; i<=endcol;i++){
                System.out.print(matrix[startrow][i]+" ");                
            }


            //print right border
            for(int i=startrow+1;i<=endrow; i++){
                System.out.print(matrix[i][endcol]+" ");   
            }


            //print bottom border
            for(int i=endcol-1; i>=startcol;i--){
                System.out.print(matrix[endrow][i]+" ");  
            }

            //print left border
            for(int i=endrow-1; i>=startrow+1;i--){
                System.out.print(matrix[i][startcol]+" ");  
            }

            startrow++;
            startcol++;
            endcol--;
            endrow--;
        }
    }


    public static void main(String[] args) {
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };

        printmatrix(matrix);

        spiral(matrix);

        
    }
}