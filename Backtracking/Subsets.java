public class Subsets {
    public static void myLogicSubsets(String s, String ans, int n, boolean choice){
        if(n==s.length()){
            System.out.print(ans+" ");
            return;
        }
        if(choice==true){
            myLogicSubsets(s, ans+s.charAt(n), n, false);
        }
        myLogicSubsets(s, ans, n+1, true);

    }

    public static void ApnaCollege(String s, String ans, int i){
        if(i==s.length()){
            if(ans.length()==0) System.out.print("null");
            System.out.print(ans+" ");
            return;
        }
        else{
            ApnaCollege(s, ans+s.charAt(i), i+1);
            ApnaCollege(s, ans, i+1);
        }
    }
    public static void main(String[] args) {
        String a= "abc";
        String ans= new String("");
        myLogicSubsets(a, ans, 0, true);

        System.out.println();

        String ans2= new String("");
        ApnaCollege(a, ans2, 0);

    }
}
