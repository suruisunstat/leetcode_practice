class Solution {
//     public int maxProfit(int[] prices) {
//         int maxProfit = 0;
//         if (prices.length <= 1) return maxProfit;
//         for (int j = 0; j < prices.length; j++) {
//             int tempProfit = range(j,prices);
//             if (tempProfit > maxProfit) {maxProfit = tempProfit;}
//         }
//         return maxProfit;
//     }
    
//     // for each element in an array, find the largest number after it and compute the difference
    
    
//     public int range(int index, int[] prices) {
//         int buyPrice = prices[index];
//         int maxPrice = -1;
//         for (int i = index; i < prices.length; i++) {
//             if (prices[i] > maxPrice) {
//                 maxPrice = prices[i];
//             }
//         }
//         int priceDiff = maxPrice - buyPrice;
//         return priceDiff;
//     }
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;  
    }
}
