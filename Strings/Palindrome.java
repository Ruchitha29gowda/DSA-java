public class Palindrome {

    public static void pal(String str){
        boolean pal = false;
        for(int i=0; i<=str.length()/2; i++){

            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                pal=false;
                System.out.print(str.charAt(i)+" <-(doesn't match with)-> ");
                System.out.println(str.charAt(str.length()-1-i));
                break;
            }
            else{
                pal=true;
            }
            
        }

        if(pal==false){  
            System.out.println("Not palindrome");
        }else{
            System.out.println("Palindrome");
        }
    }


    public static void main(String[] args) {
        String str = "moon";
        System.out.println(str);
        pal(str);
       
    }
}
