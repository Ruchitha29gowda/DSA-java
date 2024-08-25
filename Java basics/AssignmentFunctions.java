public class AssignmentFunctions {

    public static void palindrome(int n){
        int revnum = 0;
        int num = n;
        while (n>0) {
            int lastdigit = n%10;
            revnum = revnum*10 + lastdigit;
            n/=10;
        }
        System.out.println(revnum);
        if(revnum==num){
            System.out.println("PALINDROME!!");
        }
        else{
            System.out.println("NOT PALINDROME!!");
        }
    }

    public static void sumOfDigits(int n){
        int sum=0;
        while (n>0) {
            int lastdigit = n%10;
            sum+=lastdigit;
            n/=10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]){
        palindrome(11);

        sumOfDigits(54565);
    }
}
