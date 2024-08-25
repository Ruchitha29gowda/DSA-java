import java.util.ArrayList;

public class ContainerMostWater{

    public static void bruteforce(ArrayList<Integer> list){
        int maxwater = Integer.MIN_VALUE; 
        for(int i=0; i<list.size(); i++){
            for(int j=i; j<list.size(); j++){
                int maxLevel = Math.min(list.get(i), list.get(j));
                // System.out.println("Max Level "+ i +" "+j+" "+maxLevel);
                int area = maxLevel*(j-i);
                maxwater= Math.max(maxwater, area);
            }
        }

        System.out.println(maxwater);
    }

    public static void twoPointerApproach(ArrayList<Integer> list){
        int maxwater = Integer.MIN_VALUE; 
        int lp=0, rp=list.size()-1;
        while(lp<rp){
            int maxLevel = Math.min(list.get(lp), list.get(rp));
            int area = maxLevel*(rp-lp);
            maxwater= Math.max(maxwater, area);

            if(list.get(lp)<list.get(rp)) lp++;
            else rp--;
        }

        System.out.println("Maxwater: "+maxwater);
    }

    public static void main(String[] args) {
        int[] heights={1,8,6,2,5,4,8,3,7};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(2);
        list.add(7);
        // bruteforce(list);
        twoPointerApproach(list);
    }
}