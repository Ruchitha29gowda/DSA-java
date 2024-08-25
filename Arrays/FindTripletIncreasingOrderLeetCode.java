public class FindTripletIncreasingOrderLeetCode {
    public static boolean tripletExists(int nums[]){
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(nums[i]<=a) a = nums[i];
            else if(nums[i]<=b) b= nums[i];
            else return true;
        }

        return false;
    }
    

    public static void main(String[] args) {
        int[] nums = {20,100,10,12,15,13};
        int[] nums1 = {5,4,3,2,1};

        System.out.println(tripletExists(nums1));
    }
}
