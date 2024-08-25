public class BinaryStrings {

    public static String binaryStrings(int n, int lastplace, String s){
        if(n==0){
            System.err.println(s);
            return "";
        }
        else{
            if(lastplace==1){
                return binaryStrings(n-1, 0, s+"0");
            }
            else{
                return binaryStrings(n-1, 1, s+"1") + binaryStrings(n-1, 0, s+"0");
            }
        }
    }



    public static void main(String[] args) {
        binaryStrings(4, 0, "");
    }
}
