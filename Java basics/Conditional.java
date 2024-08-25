import java.util.Scanner;

public class Conditional {
    public static void main(String args[]){
        // int no= 0;
        // if(no%2==0){
        //     System.out.println("EVEN");
        // }
        // else{
        //     System.out.println("ODD");
        // }
        
        // Scanner sc = new Scanner(System.in);
        // int income = sc.nextInt();
        // int Tax;

        // if(income< 500000){
        //     Tax= 0;
        //     System.out.println("Payable Tax: "+Tax);
        // }
        // else if(income>500000 && income<=1000000){
        //     Tax = income/100*20 ;
        //     System.out.println("Payable Tax: "+Tax);
        // }
        // else{
        //     Tax = income/100*30;
        //     System.out.println("Payable Tax: "+Tax);
        // }

        // 
        
        // int a = 7;
        // String b = ((a%2)==0)? "even" : "odd";
        // System.out.println(b);
        
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // switch(a){
        //     case 1: {
        //                 System.out.println("SAMOSA");
        //                 break;
        //             }
        //     case 2: {
        //                 System.out.println("COKE");
        //                 break;
        //             }
        //     case 3: {
        //                 System.out.println("NOODLES");
        //                 break;
        //             }
        //     default: {
        //                 System.out.println("WAKE UP!!");
        //             }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE TWO NUMBERS: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("ENTER THE Operation Character (+ - * / %): ");
        char ch = sc.next().charAt(0);

        switch(ch){
            case '+' : {
                System.out.println(a+b); 
                break;
            }
            case '-' :{
                System.out.println(a-b);
                break;
            }
            case '*' :{
                System.out.println(a*b);
                break;
            }
            case '/' :{
                System.out.println(a/b);
                break;
            }
            case '%' :{
                System.out.println(a%b);
                break;
            }
            default :{
                System.out.println("Invalid Operation Character");
            }
        }





    }
}
