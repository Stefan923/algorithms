class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int idxV = -1; // valley index
        int idxP = -1; // peak index
        
        for (int i = 0; i < prices.length; ++i) {
            if (i - 1 >= 0) {
                if (i + 1 < prices.length) {
                    if (prices[i - 1] > prices[i] && prices [i] < prices[i + 1]) {
                        idxV = i;
                    } else if (prices[i - 1] < prices[i] && prices [i] >= prices[i + 1]) {
                        idxP = i;
                    }
                } else if (prices[i - 1] < prices[i]) {
                    idxP = i;
                }
                if (prices[i - 1] == prices[i] && idxV == -1) {
                    idxV = i;
                }
            } else if (i + 1 < prices.length && prices[i] < prices[i + 1]) {
                idxV = i;
            }
            
            if (idxV != -1 && idxP != -1) {
                profit += prices[idxP] - prices[idxV];
                idxV = idxP = -1;
            }
        }
        
        return profit;
    }
}
