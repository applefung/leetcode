package com.leetcode;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int result = 0;
        for(int i=0; i< prices.length; i++) {
            if(prices[i]<buy) {
                buy = prices[i];
            }
            int profit = prices[i] - buy;
            if(profit >result) {
                result = profit;
            }
        }
        return result;
    }
}
