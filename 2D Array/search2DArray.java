public class search2DArray {
    
    public static void printarray(int mat[][]){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }

    //brute force
    public static void search(int mat[][], int key){
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==key){
                    System.out.println("FOUND");
                    return;
                }
            }
            System.out.println();
        }   
        System.out.println("not Found");     
    }

    //O(nlogn)
    public static void rowWiseSearch(int mat[][], int key){
        for(int i=0; i<mat.length; i++){
            int l=0;
            int r=mat.length-1;

            while(l<r){

                int mid= (l + r)/2;
                if(mat[i][mid]==key){
                    System.out.println("Found");
                    return;
                }
                else if(key>mat[i][mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
        }

        System.out.println("not found");
    }


    public static void stairCase(int mat[][], int key){
        int row=0;
        int col = mat[0].length-1;

        while(row<mat.length && col>=0){
            if(mat[row][col]==key){
                System.out.println("FOUND!!");
                return;
            }
            else if(key>mat[row][col]){
                row++;
            }
            else{
                col--;
            }
        }

        System.out.println("not found");


    }


    public static void main(String[] args) {
        int matrix[][]= {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        printarray(matrix);
        System.out.println();

        // search(matrix, 36);
        // rowWiseSearch(matrix, 31);

        stairCase(matrix, 9);
    }
}
