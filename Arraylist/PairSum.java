import java.util.ArrayList;

public class PairSum {

    public static void pairsum(ArrayList<Integer> list, int target){
        int lp=0, rp = list.size()-1;

        while(lp<rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("Found!!"); 
                return;
            }
            else{
                if(list.get(lp)+list.get(rp)<target)lp++;
                else rp--;
            }
        }
        System.out.println("Not Found!");
    }
    
    public static void main(String[] args) {
        //sorted arraylist
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        pairsum(list, -1);

    }
}
