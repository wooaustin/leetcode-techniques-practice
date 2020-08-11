/* EASY Problem: 
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction(i.e buy one and sell one share of the stock),

Design an algorithm to find the maximum profit. Note that you cannot sell a stock before you buy one. 

Example: 

Input: [7,1, 5, 3, 6, 4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6) profit = 6 -1 = 5

*/

class Solution{
    public int bestTimeToBuySell(int[] prices){
        int maxProfit = 0;
        int minPrice = Integer.MIN_VALUE;
        for(int i = 0;i<prices.length;i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }
            if(prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }
}


