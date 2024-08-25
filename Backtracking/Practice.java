public class Practice {

    public static void subSets(String s, String ans, int n){
        if(n==s.length()){
            System.out.print(ans+" ");
            return;
        }
        else{
            subSets(s, ans+s.charAt(n), n+1);
            subSets(s, ans, n+1);
        }
    }

    public static void per(String s, String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }
        else{
            for(int i=0; i<s.length(); i++){
                char c= s.charAt(i);
                String s1 = s.substring(0, i)+s.substring(i+1);
                per(s1, ans+c);
            }
        }
    }



    public static void main(String[] args) {
        String s = "abc";
        // subSets(s, "", 0);
        per(s, "");
    }
}
