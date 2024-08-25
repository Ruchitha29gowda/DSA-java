import java.util.Stack;

public class DuplicateParenthesis {
    
    public static boolean haveDuplicates(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0 ; i<s.length(); i++){
            if(s.charAt(i)==')'){
                int count =0;
                while(!st.isEmpty() && st.peek()!='('){
                    st.pop();
                    count++;
                }
                if(count<1) return true;
                else{
                    st.pop();
                }
            }
            else{
                st.push(s.charAt(i));
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String s  = "(b+((c)))";
        System.out.println(haveDuplicates(s));
    }
}
