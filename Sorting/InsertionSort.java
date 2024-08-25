public class InsertionSort {
    
    public static void insertionSort(int nums[]){
        for(int i=1; i<nums.length; i++){
            int curr = i;
            int prev =curr-1;

            //find the correct position
            for(int j=i; j>0; j--){
                if(nums[curr]<nums[prev]  && prev>=0){
                    prev--;
                }
            }

            int t= nums[curr];
            int correctPos= prev+1;
            //shift the numbers towards right
            for(int j=curr-1; j>=prev+1; j--){
                nums[j+1]=nums[j];
            }

            //insert at the correct position
            nums[correctPos]=t;
        }

        //print that array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void apnaCollegeLogic(int nums[]){
        for(int i=1; i<nums.length-1; i++){
            int curr = nums[i];
            int prev = i-1;

            while(prev>=0 && nums[prev]>curr){
                nums[prev+1]= nums[prev];
                prev--;
            }

            nums[prev+1]=curr;
        }

        //print that array
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static void main(String[] args) {
        int nums[]={5,3,6,2,4,1,9,8,7};   

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();

        insertionSort(nums);
        // apnaCollegeLogic(nums);
    }
}