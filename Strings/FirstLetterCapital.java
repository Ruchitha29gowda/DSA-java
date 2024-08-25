public class FirstLetterCapital {

    public static void uppercase(String str){
        StringBuilder str2 = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        str2.append(ch);

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==' '){
                str2.append(str.charAt(i));
                i++;
                str2.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                str2.append(str.charAt(i));
            }
        }

        System.out.println(str2);
    }


    public static void main(String[] args) {
        String str = "my name is ruchitha";
        uppercase(str);

        

    }
}
