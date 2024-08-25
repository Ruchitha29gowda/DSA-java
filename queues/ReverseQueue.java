import java.util.*;
public class ReverseQueue {

    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int peekVal = q.poll();
        reverse(q);
        q.add(peekVal);
    }

    public static void reverseUsingStack(Queue<Integer> q){
        Stack<Integer> s = new Stack<Integer>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }

        while(!s.isEmpty()){
            q.add(s.pop());
        }
    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        reverse(q);
        System.out.println(q);
        reverseUsingStack(q);
        System.out.println(q);


    }
}
