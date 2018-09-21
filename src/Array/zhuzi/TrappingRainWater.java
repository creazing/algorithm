package Array.zhuzi;

/**
 * 问题:给定数组代表每个柱子的高度（宽度为1）问能接多少雨水
 * 思路：对于每个柱子，找到其左右两边最高的柱子，该柱子能容纳的面积就是 min(max_left, max_right) -
 height	。所以，（其中求峰值的时候用动态规划）
 1.	 从左往右扫描一遍，对于每个柱子，求取左边最大值；
 2.	 从右往左扫描一遍，对于每个柱子，求最大右值；
 3.	 再扫描一遍，把每个柱子的面积并累加。
 也可以，
 1.	 扫描一遍，找到最高的柱子，这个柱子将数组分为两半；
 2.	 处理左边一半；
 3.	 处理右边一半。
 */
public class TrappingRainWater {
    public int trap1(int[] height) {
        final int n = height.length;
        int[] left_peak = new int[n];
        int[] right_peak = new int[n];
        for(int i = 1;i<n;i++){
            left_peak[i] = Math.max(left_peak[i-1],height[i-1]);
        }
        for(int i = n-2;i>=0;i--){
            right_peak[i] = Math.max(right_peak[i+1],height[i+1]);
        }
        int res = 0;
        for(int i=1;i<=n-1;i++){

            if(Math.min(left_peak[i],right_peak[i])>height[i])
                res = res+Math.min(left_peak[i],right_peak[i])-height[i];
        }
        return res;
    }
    public int trap2(int[] A) {
        final int n = A.length;
        int peak_index = 0; // 最高的柱子，将数组分为两半
        for (int i = 0; i < n; i++)
            if (A[i] > A[peak_index]) peak_index = i;
        int water = 0;
        for (int i = 0, left_peak = 0; i < peak_index; i++) {
            if (A[i] > left_peak) left_peak = A[i];
            else water += left_peak - A[i];
        }
        for (int i = n - 1, right_peak = 0; i > peak_index; i--) {
            if (A[i] > right_peak) right_peak = A[i];
            else water += right_peak - A[i];
        }
        return water;
    }
}
