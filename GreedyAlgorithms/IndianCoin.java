import java.util.Arrays;
import java.util.Comparator;

public class IndianCoin {
    public static void findChange(Integer[] coin, int amount){

        Arrays.sort(coin, Comparator.reverseOrder());
        int count =0;
        for(int i=0; i<coin.length; i++){
            if(coin[i]<amount){
                while (coin[i]<=amount) {
                    count+=1;
                    System.out.print(coin[i]+"  ");
                    amount= amount - coin[i];
                }
            }
        }
        System.out.println();
        System.out.println(count);
    }
    


    public static void main(String[] args) {
        Integer coin[] ={1,5,10,20,50,100,200,500,1000,2000};
        int amount = 590;
        findChange(coin, amount);

    }
}
