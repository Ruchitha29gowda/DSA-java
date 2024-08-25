public class FindPemutation {
    public static void find(String s, String ans){
        if(s.length()==0){
            System.out.println("ans: "+ans);
            return;
        }

        else{
            int n=s.length();
            for(int i=0; i<n; i++){
                char curr = s.charAt(i);
                String newStr =s.substring(0, i)+s.substring(i+1);
                find(newStr, ans+curr);
            }
        }
    }
    public static void main(String[] args) {
        String s ="abc";
        find(s, new String());
    }
}
