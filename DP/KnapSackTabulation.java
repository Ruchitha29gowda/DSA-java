public class KnapSackTabulation {
    public static int findProfit(int indx, int[] wt, int[] val,int wtLeft){
        int n = val.length +1;
        int w = wtLeft +1;

        int[][] dp = new int[n][w];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(i==0 || j==0) dp[i][j] = 0;
            }
        }

        for(int i=1; i<n; i++){
            for(int j=1; j<w; j++){
                int value = val[i-1];
                int weight = wt[i-1];

                if(weight<=j){
                    //include
                    int profitIncluded = value + dp[i-1][j-weight];

                    //exclue
                    int profitExcluded = dp[i-1][j];

                    dp[i][j] = Math.max(profitIncluded, profitExcluded);
                }
                else{
                    //exclude
                    dp[i][j] = dp[i-1][j];

                }
            }
        }
        return dp[n-1][w-1];
    }
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int[] wt = {2,5,1,3,4};
        int WeightTotalAllowed = 7;  //W

        
        
        System.out.println("FINAL ANSWER: "+ findProfit(wt.length, wt, val, WeightTotalAllowed));
    }

}
