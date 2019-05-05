/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (i.e., buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Note that you cannot sell a stock before you buy one.

Example 1:

Input: [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
             Not 7-1 = 6, as selling price needs to be larger than buying price.
Example 2:

Input: [7,6,4,3,1]
Output: 0
Explanation: In this case, no transaction is done, i.e. max profit = 0.
*/
/*
time: O(n)
*/

class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len < 1)
            return 0;
        int minPrice  = prices[0];
        int profit = 0;
        for(int i=1; i<len ;i++) {
            //紀錄最低價格
            if(minPrice > prices[i])
                //更新最低價
                minPrice = prices[i];
            else{
                //判斷出最大利潤 賣出-買入最低價
                if(profit < prices[i]-minPrice)
                //更新最大利潤
                    profit = prices[i] - minPrice;
            }
        }
        return profit;
    }
}
