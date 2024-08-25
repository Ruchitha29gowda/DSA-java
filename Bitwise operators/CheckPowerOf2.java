public class CheckPowerOf2 {

    public static void checkPower(int n){
        System.out.println((n&(n-1))==0);
    }

    public static void main(String[] args) {
        checkPower(80);
    }
}