public class ConvertIntToString {

    public static String convert(int n, String s){
        if(n==0){
            System.out.println(s);
            return s;
        }
        else{
            switch (n%10) {
                case 1: s="one "+s; break;
                case 2: s="two "+s; break;
                case 3: s="three "+s; break;
                case 4: s="four "+s; break;
                case 5: s="five "+s; break;
                case 6: s="six "+s; break;
                case 7: s="seven "+s; break;
                case 8: s="eight "+s; break;
                case 9: s="nine "+s; break;
                case 0: s="zero "+s; break;
            }
            return convert(n/10, s);
        }
    }


    public static void main(String[] args) {
        convert(1947, "");
    }
}
