import java.util.Stack;

public class QueueUsing2Stack {

    static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(Stack<Integer> s){
            if(s.isEmpty()){
                return true;
            }
            return false;
        }

        public void add( int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            
        }

        public void remove(){
            if(s1.isEmpty()){
                return;
            }
            int val = s1.pop();
            System.out.println(val+"    is poped\n");
            
        }

        public void printS(){
            if(s1.isEmpty()){
                System.out.println("EMPTY");
                return;
            }
            else{
                System.out.println(s1);
            }
        }
    }

    public static void main(String[] args) {
        queue s = new queue();
        s.add( 0);
        s.printS();

        s.add( 1);
        s.printS();

        s.add( 2);
        s.printS();

        s.add( 3);
        s.printS();

        s.remove();
        s.printS();

        s.remove();
        s.printS();

        s.remove();
        s.printS();

        s.remove();
        s.printS();

        s.remove();
        s.printS();
    }
}