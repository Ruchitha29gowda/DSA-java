import java.util.PriorityQueue;

public class SlidingWindow {

    public static class MaxNodes implements Comparable<MaxNodes> {
    
        int max;
        int indx;
        MaxNodes(int indx, int max){
            this.indx = indx;
            this.max = max;
        }

        @Override
        public int compareTo(MaxNodes m1){
            //ascending order
            // return this.max - m1.max;

            //descending order
            return m1.max - this.max;
        }
    }

    public static int[] findMax(int[] arr, int k){
        int[] result = new int[arr.length-k+1];

        PriorityQueue<MaxNodes> pq = new PriorityQueue<>();
        
        for(int i=0; i<k; i++){
            pq.add(new MaxNodes(i, arr[i]));
        }
        result[0]=pq.peek().max;

        for(int i=k; i<arr.length; i++){
            while (pq.size()>0 && pq.peek().indx<=i-k) {
                pq.remove();
            }
            pq.add(new MaxNodes(i, arr[i]));
            result[i-k+1] = pq.peek().max;
        }

        return result;
    }


    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
         int[] result = findMax(arr, k);

         for(int i=0; i<result.length; i++){
            System.out.print(result[i]+" ");
         }
    }
}
