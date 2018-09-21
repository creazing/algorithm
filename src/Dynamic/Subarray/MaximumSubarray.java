package Dynamic.Subarray;

/**
 * 问题描述：给定数组找出最大连续子序列和
 * 动态规划：设状态为 f[j] ，表示以 S[j] 结尾的最大连续子序列和，则状态转移方程如下：
* f[j] = max f[j − 1] + S[j], S[j] , 1 ≤ j ≤ n
 *target = max f[j] , 1 ≤ j ≤ n
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxLocal = nums[0];
        int global = nums[0];
        for (int i = 1; i < nums.length; ++i) {
            maxLocal = Math.max(nums[i], nums[i] + maxLocal);
            global = Math.max(global, maxLocal);
        }
        return global;
    }
}
