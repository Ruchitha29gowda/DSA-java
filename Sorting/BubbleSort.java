public class BubbleSort{

    public static void sort(int nums[]){
        for(int i=0; i<nums.length-2; i++){
            for(int j=i; j<=nums.length-1; j++){
                if(nums[i]>nums[j]){
                    int temp= nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }


    public static void main(String[] args) {
        int nums[]={2,3,5,6,7,8,9,1,4};
        System.out.print("ORUGINAL ARRAY: ");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.print("  SORTED ARRAY: ");
        sort(nums);
    }
}