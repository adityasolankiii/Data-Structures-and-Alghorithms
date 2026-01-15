package Array;

class BuySellStock{

    public static int maxProfit(int[] sellPrices){
        //***************My Try***************//
        
        /*int minBuyPrice = Integer.MAX_VALUE;
        int maxSellPrice = 0;
        for (int sellPrice : sellPrices) {
            minBuyPrice = Math.min(sellPrice, minBuyPrice);
            if (minBuyPrice < sellPrice) {
                maxSellPrice = Math.max(sellPrice, maxSellPrice);
            }
        }
        return maxSellPrice-minBuyPrice;*/
        //*****************Original**************//

        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int sellPrice : sellPrices) {
            if (buyPrice < sellPrice) {
                int profit = sellPrice - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            } else {
                buyPrice = sellPrice;
            }
        }
              return maxProfit;
    }
    public static void main(String[] args) {
        int[] StockPrices = {9,2,8,4,5};
        System.out.println(maxProfit(StockPrices));
    }
}