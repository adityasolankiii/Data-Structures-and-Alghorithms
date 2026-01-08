

class BuySellStock{

    public static int maxProfit(int prices[]){
        //***************My Try***************//
        
        // int minBuyPrice = Integer.MAX_VALUE;
        // int maxSellPrice = 0;
        // for (int i = 0; i < prices.length; i++) {
        //     minBuyPrice = Math.min(prices[i],minBuyPrice);
        //     if(minBuyPrice<prices[i]){
        //         maxSellPrice = Math.max(prices[i],maxSellPrice);
        //     }
        // }

        // int maxProfit = maxSellPrice-minBuyPrice;

        //*****************Original**************//

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = prices[i];
            }
        }

        return maxProfit;
    }
    public static void main(String[] args) {
        int StockPrice[] = {5,4,3,2,1,0}; 
        System.out.println(maxProfit(StockPrice));
    }
}