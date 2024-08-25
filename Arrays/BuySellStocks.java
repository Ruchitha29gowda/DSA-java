public class BuySellStocks {

    public static void calculateProfit(int prices[]){
        int n = prices.length;
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        minBuy = prices[0];
        for(int i =1; i<=n-1; i++){
            if(minBuy<prices[i]){
                int profit = prices[i]-minBuy;

                maxProfit= Math.max(maxProfit, profit);


            }
            else{
                minBuy = prices[i];
            }
        }

        System.out.println(maxProfit);
    }

    public static void main(String[] args) {
        int prices[]= {7,1,5,3,6,4};
        calculateProfit(prices);
    }
}
