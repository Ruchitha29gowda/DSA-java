import java.util.Stack;

public class ValidParinthesis {
    public static void isValidParinthesis(String para){
        Stack<Character> st = new Stack<>();

        for(int i=0; i<para.length(); i++){
            if(para.charAt(i)=='{' || para.charAt(i)=='[' || para.charAt(i)=='('){
                st.push(para.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    System.out.println("FALSE");
                    return;
                }
                else{
                    if((para.charAt(i)=='}' && st.peek()=='{') 
                        || (para.charAt(i)==']'  && st.peek()=='[') 
                        || (para.charAt(i)==')'  && st.peek()=='(')){

                        st.pop();
                    }
                    else{
                        System.out.println("FALSE");
                        return;
                    }
                }
            }
        }
        if(st.isEmpty()){
            System.out.println("TRUE");
            return;
        }
        else{
            System.out.println("FALSE");
            return;
        }
    }
    
    public static void main(String[] args) {
        String para = "({[()]}))";
        isValidParinthesis(para);
    }
}
