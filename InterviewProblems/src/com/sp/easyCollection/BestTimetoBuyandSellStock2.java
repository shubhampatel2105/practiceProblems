package com.sp.easyCollection;

public class BestTimetoBuyandSellStock2 {
    public int maxProfit(int[] prices) {
        if(prices.length <= 1)
            return 0;
        int i=0,profit=0;
        int buyIndex=0,sellIndex=0;
        boolean shouldBuyStock=true,shouldSellStock=false;
        while(i<prices.length-1){
            if(shouldBuyStock) {
                if (prices[i] < prices[i + 1]) {
                    buyIndex=i;
                    shouldBuyStock=false;
                    shouldSellStock=true;
                }
            }else{
                if(prices[i]>prices[i+1]){
                    sellIndex=i;
                    profit+=prices[sellIndex]-prices[buyIndex];
                    shouldBuyStock=true;
                    shouldSellStock=false;
                }
            }
            i++;

        }
        if (shouldSellStock){
            profit+=prices[i]-prices[buyIndex];
        }
        return profit;
    }

    public int maxProfitSimple(int[] prices){
        if(prices.length < 2 ||prices == null)
            return 0;
        int profit=0;
        for (int i = 1; i <prices.length ; i++) {
            if (prices[i]>prices[i-1])
                profit+=prices[i]-prices[i-1];
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] prices={7,1,5,3,6,4};
        int[] prices2={1,2,3,4,5};
        int[] prices3={6,1,3,2,4,7};
        BestTimetoBuyandSellStock2 stock=new BestTimetoBuyandSellStock2();

        System.out.println(stock.maxProfit(prices));
        System.out.println(stock.maxProfit(prices2));
        System.out.println(stock.maxProfit(prices3));

        System.out.println(stock.maxProfitSimple(prices2));
    }
}
