public class StringCompression {

    public static void stringCompression(String str){
        StringBuffer newstr = new StringBuffer("");
        

        for(int i=0; i<str.length();i++){
            int count=1;
            newstr.append(str.charAt(i));
            while(i!=str.length()-1 && str.charAt(i+1)==str.charAt(i)){
                System.out.println("same");
                count++;
                i++;
            }
            System.out.println(count);
            if(count>1){
                newstr.append(count);
            }
        }

        System.out.println(newstr);
    }
    

    public static void main(String[] args) {
        String str ="aaabbcccdd";
        System.out.println(str);
        stringCompression(str);

        StringBuilder str1 = new StringBuilder(" aaabbcccdd ");
        str1.delete(0,str1.length());
        System.out.println("STR1  :"+str1.length()+"'h'");
        str1.trimToSize();
        String str3 = str1.toString();
        System.out.println(str1);
        System.out.println(str3);
    }
}
