import java.util.ArrayList;

public class RemoveSubstring {

    public static String remove(String s , boolean flag){
        if(s.contains("AB") || s.contains("BB") ){
            StringBuilder s1 = new StringBuilder(s);
            for(int i=0; i<s1.length()-1; i++){
                if(s1.charAt(i)=='A' && s1.charAt(i+1)=='B'){
                    s1.delete(i, i+2);
                    System.out.println("after deletion: "+s1.toString());
                    i--;
                    return remove(s1.toString(), flag);
                }
                else if(s1.charAt(i)=='B' && s1.charAt(i+1)=='B'){
                    s1.delete(i, i+2);
                    System.out.println("after deletion: "+s1.toString());
                    return remove(s1.toString(), flag);
                }
            }
            return remove(s1.toString(), flag);            
        }
        else{
            return s;
        }

    }
    

    public static void main(String[] args) {
        String s ="BBBBBB";
        boolean flag = true;
        // remove(s, flag);
        System.out.println(s+"\n\n");

        System.out.println("ans: "+remove(s, flag));
    }
}
