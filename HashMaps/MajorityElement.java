import java.util.HashMap;
import java.util.Set;

public class MajorityElement{

    public static void majority(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }

        Set<Integer> keys = map.keySet();
        for (Integer k : keys) {
            

            if(map.get(k)>(nums.length/3)){
                System.out.print(k+" ");
            }
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2};
        majority(nums);


    }
}