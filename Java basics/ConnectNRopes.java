import java.util.PriorityQueue;

public class ConnectNRopes {

    public static void connect(int[] arr, int N){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        for(int i=0; i<arr.length; i++){
            pq.add(arr[i]);
        }
        System.out.println(pq);
        int res =0;

        while (pq.size()>1) {
            int s1 =  pq.poll();
            int s2 =  pq.poll();
            res += s1+s2;
            pq.add(s1+s2);
        }

        System.out.println(res);
    }
    

    public static void main(String[] args) {
        int[] arr = {4,3,2,6};
        int n= 4;
        connect(arr, n);
    }
}
