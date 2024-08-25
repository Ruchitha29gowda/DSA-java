import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static int maximumUnitsLeetCode(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, Comparator.comparingDouble(o -> o[1]));
        int ans=0;
        for(int i=boxTypes.length-1; i>=0; i--){
            if(boxTypes[i][0]<=truckSize && truckSize!=0){
                ans+=boxTypes[i][0]* boxTypes[i][1];
                System.out.println(boxTypes[i][0]+"    "+boxTypes[i][1]);
                truckSize-=boxTypes[i][0];
                if(truckSize==0) break;
            }
            else{
                ans+=truckSize* boxTypes[i][1];
                System.out.println(truckSize+"    "+boxTypes[i][1]);
                break;
            }
        }

        return ans;
    }

    public static void knapSack(int[] weight, int[] values, int capacity){
        int[][] ratio = new int[weight.length][2];
        for(int i=0; i<weight.length; i++){
            ratio[i][0]=i;
            ratio[i][1]=values[i]/weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int ans = 0;
        for(int i= weight.length-1; i>=0; i--){
            if(weight[ratio[i][0]]<=capacity && capacity!=0){
                ans+=values[ratio[i][0]];
                capacity-=weight[ratio[i][0]];
                if(capacity==0) break;
            }
            else {
                ans+=ratio[i][1]*capacity;
                capacity=0;
            }
        }

        System.out.println(ans);


    }
    

    public static void main(String[] args) {
        int capacity = 50;
        int weight[]= {10,20,30};
        int values[]= {60,100,120};
        knapSack(weight, values, capacity);

        // int[][] boxTypes = {
        //     {5,10},
        //     {2,5},
        //     {4,7},
        //     {3,9},
        // };

        // System.out.println(maximumUnitsLeetCode(boxTypes, 10));;

    }
}
