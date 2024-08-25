public class InversionCount {

    //my logic
    public static void inversionCount(int nums[]){
        
        int count=0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                if(nums[i]>nums[j]) count++;
            }
        }

        System.out.println(count);
    }

    
    public static void main(String[] args) {
        int nums[]={2,3,4,1,6,7};
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        inversionCount(nums);
    }
}
