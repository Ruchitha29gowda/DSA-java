import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Revision {
    public static void main(String[] args) {
        Integer costVertical[] = {2,1,3,1,4};
        Integer costHorizontal[] = {4,1,2};

        Arrays.sort(costHorizontal, Collections.reverseOrder());
        Arrays.sort(costVertical, Collections.reverseOrder());

        int cost =0;
        int vp =1;
        int hp =1;
        int h =0;
        int v =0;

        while (h<costHorizontal.length && v<costVertical.length) {
            if(costVertical[v]>=costHorizontal[h]){
                //vertical cut
                cost+=(hp*costVertical[v]);
                v++;
                vp++;
            }
            else{
                //horizontal cut
                cost+=(vp*costHorizontal[h]);
                h++;
                hp++;
            }
        }

        while ( v<costVertical.length) {
            //vertical cut
            cost+=hp*costVertical[v];
            v++;
            vp++;
        }

        while (h<costHorizontal.length) {
            //horizontal cut
            cost+=vp*costHorizontal[h];
            h++;
            hp++;
        }

        System.out.println(cost);

    }
}
