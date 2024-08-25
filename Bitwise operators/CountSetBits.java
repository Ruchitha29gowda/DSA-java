public class CountSetBits {


    public static void count(int n){
        int count=0;
        while(n>0){
            if((n&1) == 1){
                count ++;
            }
            n=n>>1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        count(16);
    }
}
