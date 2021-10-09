package main.code.leetcode.DP;

public class _121 {
    public int maxProfit(int[] prices) {
        int lowPrice = prices[0];   //记录当前最低价格，即入手价格，初始化为最大值；
        int highPrice = 0;  //记录最高利润
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - lowPrice > highPrice) {
                highPrice = prices[i] - lowPrice;   //记录在第i天卖出的最大利润
            }
            if (lowPrice > prices[i]) {
                lowPrice = prices[i];
            }
        }
        return highPrice;
    }
}
