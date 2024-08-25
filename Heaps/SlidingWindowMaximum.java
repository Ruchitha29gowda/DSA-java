import java.util.PriorityQueue;

public class SlidingWindowMaximum {

    public static class  Window implements Comparable<Window> {
        int indx;
        int val;

        Window(int indx, int val){
            this.indx = indx;
            this.val = val;
        }
        @Override
        public int compareTo(Window w2){
            return w2.val - this.val; 
        }
        
    }
    

    public static void main(String[] args) {
        // int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int n=nums.length;
        int k = 3; //window size
        int[] ans = new int[n-k+1];

        
        PriorityQueue<Window> pq = new PriorityQueue<>();
        int i=0;
        for(i=0; i<k; i++){
            pq.add(new Window(i, nums[i]));
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        ans[0] = pq.peek().val;
        int j=1;

        for(i=k; i<n; i++){
            while(pq.peek().indx<=(i-k)){
                pq.remove();
            }
            pq.add(new Window(i, nums[i]));
            ans[j++] = pq.peek().val;
        }

        for(i=0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }



    }
}
