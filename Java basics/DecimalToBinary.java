import java.util.LinkedList;
import java.util.Queue;

public class DecimalToBinary {

    public static void binary(Queue<Integer> q, int n, int indx){
        if(indx>n){
            System.out.println(q);
            return ;
        }
        
        int power =0;
        int remainder =0;
        int ans =0;
        int num = indx;
        while (num>0) {
            remainder = num%2;
            num/=2;
            ans = ans + remainder*(int)Math.pow(10, power);
            power++;
        }
        q.add(ans);
        binary(q, n, indx+1);

    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        binary(q, 5, 0);
    }
}
