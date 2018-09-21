package Dynamic.Subarray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 问题：求最长上升子序列的长度
 * 思路1： f[i] 为第 i 个元素为终点的最长递增子序列的长度，那么状态转移方
 * 程是f[j] = max{f[i], 0 <= i < j && f[i] < f[j]} + 1
 * 思路2：维护一个数组，遍历原始数组，把元素添加到维护的数组中，如果有元素则代替
 */
public class LIS {
    public static void main(String[] args) {
        int[] a = {1, 6, 4, 3};
        System.out.println(lengthOfLIS1(a));
    }

    public static int lengthOfLIS1(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int[] f = new int[nums.length];
        int global = 1;
        Arrays.fill(f, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    f[i] = Math.max(f[j] + 1, f[i]);
                }
            }
            global = Math.max(f[i], global);

        }
        return global;
    }

    public static int lengthOfLIS2(int[] nums) {
        ArrayList<Integer> lis = new ArrayList<>();
        for (int x : nums) {
            int insertPos = lowerBound(lis, 0, lis.size(), x);
            if (insertPos >= lis.size()) {
                lis.add(x);
            } else {
                lis.set(insertPos, x);
            }
        }
        return lis.size();
    }

    private static int lowerBound(ArrayList<Integer> A,
                                  int first, int last, int target) {
        while (first != last) {
            int mid = first + (last - first) / 2;
            if (target > A.get(mid)) first = ++mid;
            else last = mid;
        }
        return first;
    }

}
