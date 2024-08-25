public class KeyPadCombination {

    final static char[][] ch = {
        {},
        {},
        {'a','b','c'},
        {'d','e','f'},
        {'g','h','i'},
        {'j','k','l'},
        {'m','n','o'},
        {'p','q','r','s'},
        {'t','u','v','w'},
        {'x','y','z'},
    };


    public static void firstCall(String str){

        if(str.length()==0){
            System.out.println("String empty: "+"");
            return;
        }
        else{
            combinations(str.length(), 0, str, new StringBuilder());
        }
    }

    public static void combinations(int len, int pos,String str, StringBuilder sol){
        if(pos==len){
            System.out.print(sol.toString()+" ");
            return;
        }
        else{
            char[] c_arr = ch[Character.getNumericValue(str.charAt(pos))];

            for(int i=0; i<c_arr.length; i++){
                combinations(len, pos+1, str, new StringBuilder(sol).append(c_arr[i]));
            }
        }
    }

    public static void main(String[] args) {
        
        firstCall("23");

    }
}
