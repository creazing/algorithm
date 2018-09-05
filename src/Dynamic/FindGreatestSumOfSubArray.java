package Dynamic;

/**
 * 问题：求连续子序列最大和
 * 思路：动态规划
 * 依次求出以钙元素为结尾的连续子序列和
 * f[i] = Math.max(f[i-1]+array[i],array[i])
 * f[0]=array[0]
 */
public class FindGreatestSumOfSubArray {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int[] f = new int[array.length];
        f[0]=array[0];
        int res = f[0];
        for(int i = 1;i<array.length;i++){
            f[i] = Math.max(f[i-1]+array[i],array[i]);
            res = Math.max(res,f[i]);
        }
        return res;
    }
}
