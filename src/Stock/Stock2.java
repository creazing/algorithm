package Stock;

/**
 * 问题：股票买卖次数不限，同一天步能同时买卖，求最大收益
 * 思路：求出差价，将正差价累加，逻辑错误但是结果正确，可以有另一个解释，将最低到最高的收益统计了
 */
public class Stock2 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        for(int i =1;i<prices.length;i++){
            int diff = prices[i]-prices[i-1];
            if(diff>0)
                profit+=diff;
        }
        return profit;
    }
}

