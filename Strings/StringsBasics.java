import java.util.Scanner;

public class StringsBasics{
    public static void main(String[] args) {
        char a[]={'a','b','c','d'};
        String str = new String("xyz");
        String str1 = "abcd";

        //Strings are immutable

        // System.out.println(str);
        // str ="hello";
        // System.out.println(str);

        //take an input
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();//takes input...single word

        // System.out.println("my name is : "+name);

        //takes a complete line as an input
        // String name2 = sc.nextLine();
        // System.out.println("my name is : "+name2);

        //concatenation
        // String name3 ="ruchitha";
        // String lastName ="Gowda";
        // String fullname = name3 + " Swamy "+lastName;

        // System.out.println(fullname);

        //other functions
        // String lines = "My name is ruchitha";
        // for(int i=0; i<lines.length(); i++){
        //     System.out.print(lines.charAt(i)+" ");
        // }


        //Substring
        //String strsub = "HelloWorld";
        //String newsub = strsub.substring(0,4);
        //System.out.println(newsub);

        //String Builder
        StringBuilder nm = new StringBuilder("ruchi");
        System.out.println(nm);
        String name = nm.toString();
        System.out.println(name);


    }
}