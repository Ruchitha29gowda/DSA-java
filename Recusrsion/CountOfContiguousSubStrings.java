public class CountOfContiguousSubStrings {

    public static int count(String s){
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        else{
            // TRADITIONAL WAY
            // for(int i=0; i<s.length(); i++){
            //     for(int j=i; j<s.length(); j++){
            //         for(int k=i; k<=j; k++){
            //             System.out.print(s.charAt(k));
            //         }
            //         System.out.print("   ");
            //     }
            //     System.out.println();
            // }

            
            return 0;
        }
    }


    public static void main(String[] args) {
        String s = "abcab";
        count(s);
    }
}
