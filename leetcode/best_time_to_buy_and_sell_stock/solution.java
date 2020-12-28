class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        
        int profit = 0;
        int minPrice = prices[0];
        
        for (int i = 1; i < prices.length; ++i) {
            int tempProfit = prices[i] - minPrice;
            if (tempProfit > 0) {
                if (profit < tempProfit) {
                    profit = tempProfit;
                }
            } else {
                minPrice = prices[i];
            }
        }
        
        return profit;
    }
}
