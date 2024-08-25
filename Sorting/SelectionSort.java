public class SelectionSort {
    
    public static void selectionSort(int nums[]){

        for(int i=0; i<nums.length-1; i++){
            int smallest= nums[i];
            int index=i;

            for(int j=i+1; j<nums.length; j++){
                if(smallest>nums[j]){
                    index =j;
                    smallest=nums[j];
                    // smallest=nums[i];
                }
            }

            int t= nums[index];
            nums[index] = nums[i];
            nums[i]=t;

        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }

    }

    public static void main(String[] args) {
        int nums[]={2,3,5,6,8,9,7,4,1};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        selectionSort(nums);
    }
}
