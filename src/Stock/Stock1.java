package Stock;

/**
 * 问题：给定数组是股票每天的价格买卖依次就最大收益
 * 思路：贪心算法，分别求出每天卖出股票获得的收益，最后返回最大的收益
 */
public class Stock1 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int profit = 0;
        int valley = prices[0];
        for(int i =1;i<prices.length;i++){
            profit = Math.max(profit,prices[i]-valley);
            valley = Math.min(valley,prices[i]);
        }
        return profit;
    }
}
