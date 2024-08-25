import java.util.ArrayList;

public class BeautifulArray {
    
    public static int[] beautifulArray(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);

        while (ans.size()<n) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            int size = ans.size();

            for(int i=0; i<size; i++){
                if(ans.get(i)*2-1 <=n){
                    temp.add(ans.get(i)*2-1);
                }
            }

            for(int i=0; i<size; i++){
                if(ans.get(i)*2 <=n){
                    temp.add(ans.get(i)*2);
                }
            }

            ans=temp;
        }

        System.out.println(ans);

        int[] ansArray = new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            ansArray[i]= ans.get(i);
        }
        

        return ansArray;
    }

    public static void main(String[] args) {
        beautifulArray(5);
    }
}
