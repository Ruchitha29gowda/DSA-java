import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> l = new ArrayList<Integer>();
        int sr=0;
        int sc=0;
        int er=matrix.length-1;
        int ec=matrix[0].length-1;

        System.out.println(matrix.length*matrix[0].length);

        while(sc<=ec && sr<=er ){
            //print top border
            for(int i=sc; i<=ec; i++){
                l.add(matrix[sr][i]);
            }
            if(l.size()>=matrix.length*matrix[0].length){
                System.out.println(l.size());
                break;
            }


            
            //print left border
            for(int i=sr+1; i<=er;i++){
                l.add(matrix[i][ec]);
            }
            if(l.size()>=matrix.length*matrix[0].length){
                System.out.println(l.size());
                break;
            }
            //print bottom border
            for(int i=ec-1; i>=sc; i--){
                l.add(matrix[er][i]);
            }
            if(l.size()>=matrix.length*matrix[0].length){
                System.out.println(l.size());
                break;
            }

            //print right border
            for(int i=er-1; i>=sr+1;i--){
                l.add(matrix[i][sc]);
            }
            
            sc++;
            sr++;
            er--;
            ec--;
            if(l.size()>=matrix.length*matrix[0].length){
                System.out.println(l.size());
                break;
            }
        
        }
        
        System.out.println("List: ");
        for(int i=0; i<l.size(); i++){
            System.out.print(l.get(i)+" ");
        }
        return l;
    }
    public static void main(String[] args) {
        int matrix[][]= {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        spiralOrder(matrix);
    }
}
