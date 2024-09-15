import java.util.*;
public class KnapSackMemoization {

    public static int apnaCollegeLogic(int indx, int[] wt, int[] val,int wtLeft, int[][] dp){
        if(indx<=0 || wtLeft<=0) return 0;
        else{
            if(dp[indx][wtLeft]!=-1){
                return dp[indx][wtLeft];
            }
            else if(wt[indx-1]<=wtLeft){
                //include
                int ans1 = val[indx -1]+ apnaCollegeLogic(indx -1 , wt, val, wtLeft - wt[indx-1], dp);

                //exclude
                int ans2 = apnaCollegeLogic(indx -1 , wt, val, wtLeft , dp);

                dp[indx][wtLeft] =  Math.max(ans1, ans2);
                return dp[indx][wtLeft];
            }
            else{
                dp[indx][wtLeft] = apnaCollegeLogic(indx -1 , wt, val, wtLeft , dp);
                return dp[indx][wtLeft];
            }
        }
    }


    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int WeightTotalAllowed = 7;  //W

        int n = val.length +1;
        int w = WeightTotalAllowed +1;

        int[][] dp = new int[n][w];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                dp[i][j] = -1;
                // System.out.print(dp[i][j]+"  ");
            }
            // System.out.println();
        }
        
        System.out.println("FINAL ANSWER: "+ apnaCollegeLogic(wt.length, wt, val, WeightTotalAllowed, dp));

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
