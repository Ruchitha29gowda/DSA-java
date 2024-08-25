import java.util.Stack;

public class NextGreaterElement {
    public static void nextGreater(int[] arr, int[] nextGrt){
        Stack<Integer> st = new Stack<>();

        for(int i=arr.length-1; i>=0; i--){
            int curr = arr[i];
            while (!st.isEmpty() && curr>arr[st.peek()]) {
                st.pop();
            }

            if(st.isEmpty()) nextGrt[i]=-1;
            else{
                nextGrt[i]=arr[st.peek()];
            }
            
            st.add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGrt = new int[arr.length];
        nextGreater(arr, nextGrt);

        for(int i=0; i<nextGrt.length; i++){
            System.out.print(nextGrt[i]+" ");
        }
    }
}
