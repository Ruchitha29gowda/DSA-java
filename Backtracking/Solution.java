import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static long gridGame(int[][] grid) {
        if(grid[0].length==1) return 0;

        long[] pref = new long[grid[0].length];
        long[] suff = new long[grid[0].length];

        suff[suff.length-1]=grid[0][grid[0].length-1];
        pref[0]=grid[1][0];
        
        
        for(int i=suff.length-2; i>=0; i--){
            suff[i]=suff[i+1]+grid[0][i];
        }
        for(int i=0; i<suff.length; i++){
            System.out.print(suff[i]+" ");
        }
        System.out.println();

        /************prefix***************** */

        for(int i=1; i<pref.length; i++){
            pref[i]=pref[i-1]+grid[1][i];
        }
        for(int i=0; i<suff.length; i++){
            System.out.print(pref[i]+" ");
        }
        System.out.println();


        int indx =0;
        for(int i=0; i<suff.length-1; i++){
            if(suff[i+1]<pref[i]){
                indx =i; 
                System.out.println("Indx: "+indx);
                break;
            }
            if(i==suff.length-2){
                indx = suff.length-1;
                System.out.println("Indx: "+indx);
                break;
            }
        }

        if(indx==suff.length-1) return pref[indx-1];
        if(indx==0) return suff[indx+1];

        return Math.max(suff[indx+1], pref[indx-1]);

    }


    public static List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> temp = new ArrayList<>();

        int[][] t = new int[grid.length][grid[0].length];

        for(int rounds=0; rounds<k; rounds++){
            for(int i=0; i<t.length; i++){
                for(int j=0; j<t[0].length; j++){
                    if((j+1)!=t[0].length) t[i][j+1] =grid[i][j];
                    if((i+1)!=t.length) t[i+1][0]= grid[i][grid[0].length-1];
                    t[0][0] = grid[grid[0].length-1][grid[0].length-1];
                }
            }

            for(int i=0; i<t.length; i++){
                for(int j=0; j<t[0].length; j++){
                    grid[i][j] =t[i][j];
                }
            }

            for(int i=0; i<t.length; i++){
                for(int j=0; j<t[0].length; j++){
                    System.out.print(grid[i][j]+" ");;
                }
                System.out.println();
            }

            System.out.println();
        }

        
        
        for(int i=0; i<t.length; i++){
            List<Integer> l1= new ArrayList<>();

            for(int j=0; j<grid[0].length; j++){
                l1.add(grid[i][j]);
            }

            temp.add(l1);
        }

        return temp;
    }
    public static void main(String[] args) {
        int[][] grid={
            {1},
            {2},
            {3},
            {4},
            {6},
            {5},
        };

        System.out.println("Anser : "+shiftGrid(grid, 1));;
    }
}