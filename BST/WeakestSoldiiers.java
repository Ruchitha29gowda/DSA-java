import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class WeakestSoldiiers {

    public static class Soldier implements Comparable<Soldier>{
        int soldiers;
        int indx;

        Soldier(int soldiers, int indx){
            this.soldiers=soldiers;
            this.indx= indx;
        }

        @Override
        public int compareTo(Soldier s1){
            if(this.soldiers == s1.soldiers){
                return this.indx-s1.indx;
            }
            return this.soldiers - s1.soldiers;
        }
    }

    public static void usingPriorityQueue(int[][] mat, int k){
        PriorityQueue<Soldier> pq = new PriorityQueue<>();
        for(int i=0; i<mat.length; i++){
            int solCount=0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1) solCount++;
            }
            pq.add(new Soldier(solCount, i));
        }

        for(int i=0; i<k; i++){
            System.out.print(pq.remove().indx+" ");
        }
    }

    public static void weak(int[][] mat, int k){
        ArrayList<Integer> ans = new ArrayList<>();

        int[][] helper = new int[mat.length][2];
        for(int i=0; i<mat.length; i++){
            int count =0;
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1) count++;
            }
            
            helper[i][0]=i;
            helper[i][1]=count;
        }

        // Arrays.sort(helper, Comparator.comparingDouble(o->o[1]));

        for(int i=0; i<helper.length; i++){
            System.out.println(helper[i][0]+" "+helper[i][1]);
        }
        System.out.println();

        for(int i=0; i<helper.length; i++){
            if(helper[i][1]<mat[0].length/2){
                ans.add(helper[i][1]);
                System.out.print(helper[i][0]+" ");
                k--;
            }
            if(k==0) break;
        }

    }
    

    public static void main(String[] args) {
        int[][] mat = {
            {1,0,0,0},
            {1,1,1,1},
            {1,0,0,0},
            {1,0,0,0},
        };

        weak(mat, 2);
        System.out.println();
        usingPriorityQueue(mat, 2);
    }
}
