public class MajorityElement {

    public static void majority(int nums[], int limit){
        for(int i=0; i<nums.length; i++){
            int count=0;
            for(int j=0; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            
            if(count>limit){
                System.out.println(nums[i]);
            }
            else{
                System.out.println("-1");
            }
        }
    }

    public static int majorityRecursion(int nums[], int si, int ei){

        if(si>=ei){
            return nums[si];
        }
        int mid= si+ (ei-si)/2;
        int left = majorityRecursion(nums, si, mid);
        int right = majorityRecursion(nums, mid+1, ei);

        if(left==right) return left;

        int leftCount = count(nums, left, si, ei);
        int rightCount = count(nums, right, si, ei);

        if(leftCount>rightCount) return left;
        else return right;
    }

    public static int count(int nums[],int n ,int si, int ei){
        int count =0;
        for(int i=si; i<=ei; i++){
            if(nums[i]==n) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        // majority(nums, nums.length/2);

        System.out.println(majorityRecursion(nums, 0, nums.length-1));
    }
}
