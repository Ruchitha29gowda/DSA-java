import java.util.Arrays;

public class CountingSort {

    public static void countingSort(int nums[]){
        //find the max element
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            largest= Math.max(largest, nums[i]);
        }
        // System.out.println(largest);

        //build the frequency array
        int freq[] = new int[largest+1];

        for(int i=0; i<nums.length;i++){
            freq[nums[i]]=freq[nums[i]]+1;
        }

        System.out.println("Frequency array: ");
        for(int i=0; i<=freq.length-1; i++){
            System.out.print(freq[i]+" ");
        }

        //sorting the array
        int j=0;
        for(int i=0; i<=freq.length-1; i++){
            while(freq[i]>0){
                nums[j]=i;
                freq[i]--;
                j++;
            }
        }


    }



    public static void main(String[] args) {
        int nums[]= {2,1,2,2,3,3,3,4,4,3,5,4};
        System.out.println("Actual array: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        } 

        System.out.println();
        // Arrays.sort(nums);
        countingSort(nums);

        System.out.println("\nSorted array: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
}
