public class Power{

    public static int power(int n, int x){
        if(n==1){
            return x;
        }
        else{
            return x*power(n-1, x);
        }
    }
    public static void main(String args[]){
        System.out.println("Recursion");

        System.out.println(power(10,2));;
    }
}