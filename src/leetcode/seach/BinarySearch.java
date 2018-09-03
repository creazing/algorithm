package leetcode.seach;

public class BinarySearch {
    public static int lower_bound(int[] A, int first, int last, int target) {
        //返回大于等于target的值的第一个索引，如果没有则返回last,也就是新元素从前插入的位置
        //左闭区右开区间，区间左边的都是小于target的，包括右侧开区间的右侧的元素都是大于等于target的
        //思路和闭区间的思路是一样的，只需要注意一下开区间的更新
        while (first != last) {
            int mid = (first + last) / 2;
            if (A[mid] < target)
                first = mid + 1;
            else
                last = mid;
        }
        return first;
    }

    public static int upper_bound(int[] A, int first, int last, int target) {
        //返回第一个大于target的索引，如果不存在则返回last，也就是新元素从后插入的位置
        while (first != last) {
            int mid = (first + last) / 2;
            if (A[mid] <= target)
                first = mid;
            else
                last = mid;
        }
        return first;
    }
}
