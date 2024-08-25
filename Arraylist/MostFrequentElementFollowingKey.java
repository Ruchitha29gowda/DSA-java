public class MostFrequentElementFollowingKey {
    
    public static int frequent(int[] nums, int key){


        int maxIndex=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxIndex) maxIndex=nums[i];
        }

        int[] n = new int[maxIndex+1];
        for(int i=0; i<nums.length-1; i++){
            if(key==nums[i]){
                n[nums[i+1]]=n[nums[i+1]]+1;
            }
        }

        int count=0;
        
        for(int i=0; i<n.length; i++){
            if(n[i]>n[count]){
                count=i;
                System.out.println(n[i]);
                System.out.println(n[1000]);
            }
        }

        // System.out.println(n[count]);
        // System.out.println(n[1000]);

        System.out.println("count:   "+count);
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {2,1000,2,1000,2,3};
        frequent(nums, 2);

    }
}
