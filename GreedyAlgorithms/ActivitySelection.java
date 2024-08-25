import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection{
    public static int count =0;

    public static void Findmax(int[] startTime, int[] endTime){
        int last = 0;
        if(startTime.length>=1){
            count+=1;
            System.out.print("A"+'0'+"  ");
            last = endTime[0];
        }
        for(int i=1; i<startTime.length; i++){
            if(startTime[i]>=last){
                count+=1;
                last = endTime[i];
                System.out.print("A"+i+"  ");
            }
        }
        System.out.println();

        System.out.println(count);
    }

    public static void unsortedFindMax(int[] startTime, int[] endTime){
        int[][] activities = new int[startTime.length][3];
        int count = 0;

        for(int i=0; i<startTime.length; i++){
            activities[i][0]=i;
            activities[i][1]=startTime[i];
            activities[i][2]=endTime[i];
        }

        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        int last = activities[0][0];
        count+=1;
        System.out.print("A"+'0'+"  ");
        for(int i=1; i<activities.length; i++){
            if(activities[i][1]>=last){
                count+=1;
                System.out.print("A"+activities[i][0]+"  ");
                last=activities[i][2];
            }
        }
        System.out.println();

        System.out.println(count);
        
    }

    



    public static void main(String[] args) {
        int[] startTime = {1,3,0,5,8,5};
        int[] endTime = {2,4,6,7,8,9};
        Findmax(startTime, endTime);
        unsortedFindMax(startTime, endTime);
    }
}