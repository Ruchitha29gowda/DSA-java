import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class JobSequencing {

    /**
     * Jobs
     */
    public static class Jobs {
        int id;
        int deadline; 
        int profit;

        public Jobs(int id, int deadline, int profit){
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
        
    }

    public static void maxProfit(int[][] jobsInfo){

        //creating arraylist of objects
        ArrayList<Jobs> list = new ArrayList<>();
        for(int i=0; i<jobsInfo.length; i++){
            Jobs j = new Jobs(i, jobsInfo[i][0], jobsInfo[i][1]);
            list.add(j);
            //add all objects
        }

        //sort the arrayList of objects

        //for ascending order
        // Collections.sort(list, (obj1, obj2)-> (obj1.profit - obj2.profit));

        //for descending ordder
        Collections.sort(list, (obj1, obj2)-> obj2.profit - obj1.profit);

        ArrayList<Integer> ans = new ArrayList<>();
        int time =0;
        for(int i=0; i<list.size(); i++){
            Jobs curr = list.get(i);
            if (curr.deadline>time) {
                ans.add(curr.id);
                time+=1;
            }
        }

        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+"   ");
        }
        System.out.println();
    }

    public static void withoutObjects(int[][] jobsInfo){
        int[][] indxMatrix = new int[jobsInfo.length][3];
        for(int i=0; i<jobsInfo.length; i++){
            indxMatrix[i][0]= i;
            indxMatrix[i][1]= jobsInfo[i][0];
            indxMatrix[i][2]= jobsInfo[i][1];
        }
        Arrays.sort(indxMatrix, Comparator.comparingDouble(o->o[2]));
        for(int i=0; i<jobsInfo.length; i++){
            System.out.println(indxMatrix[i][0]+" "+indxMatrix[i][1]+" "+indxMatrix[i][2]);
        }
        System.out.println();


        int time =0;
        int profit=0;
        for(int i=jobsInfo.length-1; i>=0; i--){
            if(indxMatrix[i][1]>time){
                profit+=jobsInfo[i][1];
                time+=1;
                System.out.print(indxMatrix[i][0]+"     ");
            }
        }
        System.out.println();

        System.out.println(profit);
    }


    public static void main(String[] args) {
        int[][] jobsInfo = {
            {4,20},
            {1,10},
            {1,40},
            {1,30},
        };

        // maxProfit(jobsInfo);
        withoutObjects(jobsInfo);
    }
}
