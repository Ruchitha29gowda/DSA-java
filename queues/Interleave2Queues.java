import java.util.LinkedList;
import java.util.Queue;

public class Interleave2Queues {

    public static void merge(Queue<Integer> q){
        int size = q.size();
        Queue<Integer> firstHalf = new LinkedList<>();
        for(int i=0; i<size/2; i++){
            firstHalf.add(q.poll());
        }

        System.out.println(firstHalf);
        System.out.println(q);

        for(int i=0; i<size/2; i++){
            q.add(firstHalf.poll());
            q.add(q.poll());
        }

        System.out.println(q);
    }
    

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        merge(q);

    }
}
