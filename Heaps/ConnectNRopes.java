import java.util.PriorityQueue;

public class ConnectNRopes {
    static int totalCost = 0;

    public static int cost(int[] ropes){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<ropes.length; i++){
            pq.add(ropes[i]);
        }
        if(pq.size()==1 || pq.size()==0){
            return pq.size();
        }

        int temp=0;
        while (!pq.isEmpty()) {
            

            int a = pq.remove();
            int b = pq.remove();
            System.out.print(a+" + "+b+" = ");

            temp =a+b;
            System.out.println(temp);

            if(pq.isEmpty()) return temp;
            else{
                pq.add(temp);
            }
            temp = 0;
        }

        return temp;
    }
    public static void main(String[] args) {
        int[] ropes = {2,3,3,4,6};

        System.out.println(cost(ropes));
    }
}
