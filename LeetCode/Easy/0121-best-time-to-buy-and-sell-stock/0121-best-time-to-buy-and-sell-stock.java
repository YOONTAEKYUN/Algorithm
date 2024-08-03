import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        
        for(int i = 1; i < prices.length; i++) {
            if(prices[i - 1] < buy) {
                buy = prices[i - 1];
            }
            if(profit < prices[i] - buy) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}