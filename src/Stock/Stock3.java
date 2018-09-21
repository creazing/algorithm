package Stock;
/**
 * 问题：最多可以买卖两次，求股票的最大收益
 * 设状态 f(i) ，表示区间[0,i](0 ≤ i ≤ n − 1)的最大利润，状态 g(i) ，表示区间[i,n − 1](0 ≤ i ≤ n − 1)的
 最大利润，则最终答案为max f(i) + g(i) , 0 ≤ i ≤ n − 1。
 允许在一天内买进又卖出，相当于不交易，因为题目的规定是最多两次，而不是一定要两次。
 将原数组变成差分数组，本题也可以看做是最大 m 子段和， m=2 ，参考代
 */
public class Stock3 {
    public int maxProfit(int[] prices) {
        if(prices.length<2)
            return 0;
        int len = prices.length;
        int[] f = new int[len];
        int[] g = new int[len];
        for(int i =1,valley = prices[0];i<len;i++){
            f[i] = Math.max(f[i-1],prices[i]-valley);
            valley = Math.min(valley,prices[i]);
        }
        for(int i = len-2,peek = prices[len-1];i>=0;i--){
            g[i] = Math.max(g[i],peek-prices[i]);
            peek = Math.max(peek,prices[i]);

        }
        int profit = 0;
        for(int i =0;i<len;i++){
            profit = Math.max(profit,f[i]+g[i]);
        }
        return profit;
    }
}
