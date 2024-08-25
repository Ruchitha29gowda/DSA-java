public class LongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            System.out.println("EMPTY");
            return 0;
        }

        StringBuilder str = new StringBuilder(""+s.charAt(0));
        int l=str.length();
        int max=0;
        if(s.length()==1){
            max=1;
            System.out.println("single "+max);
            return 1;
        }

        for(int i=1; i<s.length(); i++){
            
            if(str.indexOf(""+s.charAt(i))<0){
                str.append(s.charAt(i));
            }
            else{
                str.delete(0,str.length());
                str.append(s.charAt(i));
            }
            
            l=str.length();
            max=Math.max(max,l);            
        }
    System.out.println(max);

        return max;
    }


    public static void main(String[] args) {
        String s = "abcabcbb";
        String s2="dvdf";

        StringBuilder str = new StringBuilder("dvdf");
        String str2 = str.substring(1, str.length());
        System.out.println(str2);
        
        lengthOfLongestSubstring(s2);
    }
}
