import java.util.Scanner;

public class FunctionProgram {
    //FUNTION OVERLOADING
    public static int sum(int a , int b){
        return a+b;
    }

    public static int sum(int a , int b, int c){
        return a+b+c;
    }

    //TO CHECK IT'S PRIME OR NOT IN AN OPTIMIZED WAY
    //ANY NUMBER HAS ROOTS SUCH AS ((UNDER ROOT n) * (UNDER ROOT n) AFTER THAT ROOTS REPEAT THEMLSELVES)
    public static boolean prime(int n){
        if(n==2){
                return true;
        }

        for(int i = 2; i<= Math.sqrt(n); i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void prime(int start, int end){
        int count =0;
        System.out.println("PRIME NUMBERS: ");
        int n= start;
        if(n==1){
            n++;
        }
        
        while (n<=end){
            boolean isprime = prime(n);
            if(isprime){
                System.out.print(n +" ");
                count++;
            }
            n++;
        }
        System.out.println(" \nTOTAL PRIME NUMBERS: "+count);
    }

    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c=35;
        // System.out.println(sum(a, b,c));

        // int n = sc.nextInt();
        // System.out.println(prime(n));

        //PRIME IN RANGE
        // int start = sc.nextInt();
        // int end = sc.nextInt();
        // prime(start, end);



    }
}
