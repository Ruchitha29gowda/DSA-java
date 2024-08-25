import java.util.ArrayList;

public class PairSum2 {
    
    public static void pairsum(ArrayList<Integer> list, int target){

        int i=0;
        while(list.get(i)<list.get(i+1)) i=i+1;

        System.out.println((i+1)+" "+list.get(i+1));

        
        int lp=i+1, rp = i;

        while(lp<list.size() && rp>=0){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("Found!! at "+lp+" "+rp); 
                return;
            }
            else{
                if(list.get(lp)+list.get(rp)<target){
                    lp++;
                    if(lp==i+1) break;
                }
                else{
                    rp--;
                    if(rp==i) break;
                }
            }

            if(lp==list.size()) lp=0;
            if(rp==0) rp=list.size()-1;
        }
        System.out.println("Not Found!");
    }


    public static void pairsumApnaCollege(ArrayList<Integer> list, int target){

        int i=0;
        while(list.get(i)<list.get(i+1)){
            i=i+1;
        }

        int lp=i+1, rp = i;

        while(lp!=rp){
            if(list.get(lp)+list.get(rp)==target){
                System.out.println("Found!! at "+lp+" "+rp); 
                return;
            }
            else{
                if(list.get(lp)+list.get(rp)<target){
                    lp=(lp+1)%list.size();
                }
                else{
                    rp=(list.size()+rp-1)%list.size();
                }
            }
        }
        System.out.println("Not Found!");
    }



    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(list);
        pairsum(list, 14);
        System.out.println();
        pairsumApnaCollege(list, 14);
    }
}
