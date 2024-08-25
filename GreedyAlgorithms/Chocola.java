import java.util.*;

public class Chocola {
    public static void printArr(Integer[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Integer[] horizontalCost ={2,1,3,1,4};
        Integer[] verticalCost ={4,1,2};

        Arrays.sort(horizontalCost, Collections.reverseOrder());
        printArr(horizontalCost);
        Arrays.sort(verticalCost, Collections.reverseOrder());
        printArr(verticalCost);

        int h=0;
        int v=0;
        int hp=1; //horizontal pieces
        int vp=1; //vertical pieces
        int finalCost = 0;


        while(h<horizontalCost.length && v<verticalCost.length){
            if(horizontalCost[h]>=verticalCost[v]){
                finalCost += (horizontalCost[h]*vp);
                h++;
                hp++;
            }
            else{
                finalCost += (verticalCost[v]*hp);
                vp++;
                v++;
            }
        }

        while(h<horizontalCost.length){
            finalCost += (horizontalCost[h]*vp);
            h++;
            hp++;
        }

        while(v<verticalCost.length){
            finalCost += (verticalCost[v]*hp);
            vp++;
            v++;
        }

        System.out.println(finalCost);
        System.out.println(h);
        System.out.println(v);
    }
}
    