import java.util.Stack;

public class StockSpan {

    public static void stockSpan(int[] prices, int[] span){
        Stack<Integer> st = new Stack<>();
        span[0]=1;
        st.add(0);

        for(int i=1; i<prices.length; i++){
            int curr = prices[i];

            while (!st.isEmpty() && curr>=prices[st.peek()]) {
                // System.out.print(st.pop()+" ");
                st.pop();
            }
            System.out.println();
            if(st.isEmpty()){
                st.add(i);
                span[i]=i+1;
            }
            else{
                span[i]=i-st.peek();
                st.add(i);
            }
        }

        for(int i=0; i<span.length; i++){
            System.out.print(span[i]+" ");
        }
    }
    

    public static void main(String[] args) {
        int[] prices = {100,80,60,70,60,85,100};
        int span[]= new int[prices.length];

        stockSpan(prices, span);


    }
}
