import java.util.LinkedList;

public class First{


    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();
        ll.addLast(3);
        ll.addLast(4); 
        ll.addFirst(0);

        System.out.println(ll);
    }
}