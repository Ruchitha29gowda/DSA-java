import java.util.PriorityQueue;

public class WeakestSoldiers {

    public static class OrderSol implements Comparable<OrderSol>{
        int indx;
        int count;

        OrderSol(int[] row, int indx){
            int c =0;
            for(int i=0; i<row.length; i++){
                if(row[i]==1){
                    c+=1;
                }
            }
            this.count = c;
            this.indx = indx;
        }

        @Override
        public int compareTo(OrderSol o1){
            if(this.count == o1.count) return this.indx - o1.indx;

            return this.count - o1.count;

        }
        
    }
    

    public static void main(String[] args) {
        int[][] sol ={
            {1,0,0,0},
            {1,1,1,1,},
            {1,0,0,0},
            {1,0,0,0},
        };

        PriorityQueue<OrderSol> pq = new PriorityQueue<>();
        for(int i=0; i<sol.length; i++){
            pq.add(new OrderSol(sol[i], i));
        }

        int k=2;
        for(int i=0; i<k; i++){
            System.out.print("row"+pq.remove().indx+" ");
        }

        
    }
}
