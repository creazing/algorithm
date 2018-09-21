package Dynamic.Subarray;

/**
 * 问题：最大连续子序列积
 * 思路：这题跟“最大连续子序列和”非常类似，只不过变成了“最大连续子序列积”，所以解决思路也很类似。
 仅仅有一个小细节需要注意，就是负负得正，两个负数的乘积是正数，因此我们不仅要跟踪最大值，还要
 跟踪最小值。
 */
public class MaximumProductSubarray {
    public int maxProduct(int[] nums) {
        int maxLocal = nums[0];
        int minLocal = nums[0];
        int global = nums[0];
        for(int i=1;i<nums.length;i++){
            int oldMaxLocal = maxLocal;
            maxLocal = Math.max(Math.max(maxLocal*nums[i],minLocal*nums[i]),nums[i]);
            minLocal = Math.min(Math.min(oldMaxLocal*nums[i],minLocal*nums[i]),nums[i]);
            global = Math.max(global,maxLocal);
        }
        return global;

    }
}
