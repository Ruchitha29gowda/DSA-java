import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {


        // int i =1;
        // int sum = 0;
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // int n = sc.nextInt();

        // while (i<=n) {
        //     sum+=i;
        //     i++;
        // }
        // System.out.println(sum);
        

        // for(int i=1; i<=4;i++){
        //     for(int j=1; j<=4; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // int n =123456;
        // while(n>0){
        //     System.out.print(n%10);
        //     n/=10;
        // }

        // int n =123456, rev=0;
        // while(n>0){
        //     int lastDigit = n%10;
        //     rev = (rev*10)+lastDigit;
        //     n/=10;
        // }
        // System.out.println(rev);
        
        // Scanner sc = new Scanner(System.in);
        // while(true){
        //     System.out.print("Enter a number divisible by 10: ");
        //     int number = sc.nextInt();
        //     if (number%10==0) {
        //         break;
        //     }
        //     else{
        //         System.out.println("Try again");
        //     }
        // }
        // System.out.println("CORRECT!");

        // Scanner sc = new Scanner(System.in);
        // while(true){
        //     System.out.print("Enter number");
        //     int n = sc.nextInt();
        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println(n);
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int a = sc.nextInt();
        // int i =2;

        // while(true){
        //     if(i==a){
        //         System.out.println("PRIME");
        //         break;
        //     }
        //     else{
        //         if(a%i==0){
        //             System.out.println("COMPOSITE");
        //             break;
        //         }
        //         i++;
        //     }
        // }

        //OR FROM FOR LOOP

        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int n = sc.nextInt();
        // boolean isPrime = true;
        // for(int i=2; i<n; i++){
        //     if(n%i==0){
        //         System.out.println("Not prime");
        //         isPrime= false;
        //         break;
        //     }
        // }
        // if(isPrime){
        //     System.out.println("PRIME");
        // }

        // int odd=0, even =0;
        // Scanner sc = new Scanner(System.in);
        // while(true){
        //     System.out.println("Enter a number : ");
        //     int n = sc.nextInt();

        //     if(n%2==0){
        //         even+=n;
        //         System.out.println("Even: "+even);
        //     }
        //     else{
        //         odd+=n;
        //         System.out.println("ODD: "+odd);
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int i =1,sum=1;
        if(n==0){
            System.out.println("FACTORIAL: "+sum);
        }

        while(i<=n){
            sum*=i;
            i++;

        }
        System.out.println("FACTORIAL: "+sum);


    }
}
