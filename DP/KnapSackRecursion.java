public class KnapSackRecursion {
    static int maxProfit =0;
    public static void findProfit(int indx, int[] wt, int[] val, int profit, int wtLeft){
        if(indx>=wt.length || wtLeft<=0){
            maxProfit = Math.max(profit, maxProfit);
            System.out.println(maxProfit);
            return;
        }
        if(wt[indx]<=wtLeft){
            findProfit(indx+1, wt, val, profit+val[indx], wtLeft-wt[indx]);
        }
        findProfit(indx+1, wt, val, profit, wtLeft);
    }

    public static int apnaCollegeLogic(int indx, int[] wt, int[] val,int wtLeft){
        if(indx<=0 || wtLeft<=0) return 0;
        else{
            if(wt[indx-1]<=wtLeft){
                //include
                int ans1 = val[indx -1]+ apnaCollegeLogic(indx -1 , wt, val, wtLeft - wt[indx-1]);

                //exclude
                int ans2 = apnaCollegeLogic(indx -1 , wt, val, wtLeft );

                return Math.max(ans1, ans2);
            }
            else return apnaCollegeLogic(indx -1 , wt, val, wtLeft );
        }
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int WeightTotalAllowed = 7;  //W
        // findProfit(0, wt, val, 0, WeightTotalAllowed);
        // System.out.println("FINAL ANSWER: "+maxProfit);

        System.out.println(apnaCollegeLogic(wt.length, wt, val, WeightTotalAllowed));
    }
}
