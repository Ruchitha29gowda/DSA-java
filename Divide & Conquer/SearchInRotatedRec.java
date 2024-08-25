public class SearchInRotatedRec {

    public static int search(int[] nums, int target, int si, int ei){
        if(si>ei) return -1;
        int mid = si + (ei- ei)/2;
        if(nums[mid]==target){
            return mid;
        }
        
        //L1
        if(nums[mid]>=nums[si]){
            //L1 -> left
            if(target>=nums[si] && target<=nums[mid]){
                return search(nums, target, si, mid-1);
            }
            //L1 -> right
            else{
                return search(nums, target, mid+1, ei);
            }
        }
        else{
            if(target<nums[ei] && target>=nums[mid]) return search(nums, target, si, mid-1);
            else return search(nums, target, mid+1, ei);
        }
    }


    public static void main(String[] args) {
        int[] nums= {4,5,6,7,0,1,2};
        System.out.println(search(nums, 10, 0, nums.length-1));
    }
}
