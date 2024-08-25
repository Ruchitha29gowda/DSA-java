import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LonelyNumber {

    public static void leetcode(int[] nums){
        List<Integer> l = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=1; i<nums.length-1; i++){
            if(nums[i]>nums[i-1]+1 && nums[i]<nums[i+1]-1){
                l.add(nums[i]);
            }
        }
        if(nums.length==1) l.add(nums[0]);
        
        if(nums.length>1){
            System.out.println("entered");
            if(nums[0]<nums[1]-1){
                l.add(nums[0]);
                System.out.println("added");
            }
            if(nums[nums.length-2]<nums[nums.length-1]-1){
                l.add(nums[nums.length-1]);
            }
        }
        System.out.println(l);
    }

    public static void lonely(ArrayList<Integer> l ){
        Collections.sort(l);
        ArrayList<Integer> temp = new ArrayList<>();
        System.out.println(l);
        for(int i=1; i<l.size()-1; i++){
            if(l.get(i)>l.get(i-1)+1 && l.get(i)<l.get(i+1)-1){
                temp.add(l.get(i));
            }
        }

        if(l.size()==1){
            temp.add(l.get(0));
        }

        if(l.size()>1){
            if(l.get(0)<l.get(1)-1){
                temp.add(l.get(0));
            }
            if(l.get(l.size()-2)<l.get(l.size()-1)-1){
                temp.add(l.get(l.size()-1));
            }
        }

        System.out.println(temp);

    }
    

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(3);

        // lonely(l);

        int[] n = {10,6,5,8};

        leetcode(n);
    }
}
