//Find the first non- repeating charachter in a stream of characters


import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeating {
    public static int getFirst(String s){
        int[] map = new int[26];
        Queue<Character> q = new LinkedList<>();
        Queue<Integer> indx = new LinkedList<>();

        for(int i=0; i<s.length(); i++){
            map[s.charAt(i)-'a']+=1;
            q.add(s.charAt(i));
            indx.add(i);
            // System.out.println("Queue"+ q);

            while(!q.isEmpty() && map[q.peek()-'a']>1 ){
                q.poll();
                indx.poll();
            }


            if(q.isEmpty()) System.out.print("-1    ");
            else System.out.print(q.peek()+"     ");
        }
        System.out.println();

        System.out.println("The unique character is: "+q.poll());
        if(q.isEmpty()) return -1;
        else return indx.poll();
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(getFirst(s));
    }
}