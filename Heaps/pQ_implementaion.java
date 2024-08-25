import java.util.PriorityQueue;

public class pQ_implementaion {
    
    public static class Students implements Comparable<Students>{
        String name;
        int rank;

        Students(String nm, int rank){
            this.name = nm;
            this.rank = rank;
        }

        @Override
        public int compareTo(Students s2){
            return this.rank- s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Students> pq = new PriorityQueue<>();
        pq.add(new Students("A", 103));
        pq.add(new Students("B", 101));
        pq.add(new Students("C", 102));

        System.out.println(pq.peek().name+" -> "+pq.remove().rank);
        System.out.println(pq.peek().name+" -> "+pq.remove().rank);
        System.out.println(pq.peek().name+" -> "+pq.remove().rank);
    }
}
