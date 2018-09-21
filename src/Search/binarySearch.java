package Search;

public class binarySearch {
    /**
     * 插入位置的最前面，也就是大于等于目标值的第一个索引
     */
    int lower_bound (int[] A, int first, int last, int target) {
        while (first != last) {
            int mid = first + (last - first) / 2;
            if (target > A[mid]) first = ++mid;
            else last = mid;
        }
        return first;
    }

    /**
     * 插入位置的最后面，也就是大于目标值的第一个索引
     */
    int upper_bound (int[] A, int first, int last, int target) {
        while (first != last) {
            int mid = first + (last - first) / 2;
            if (target >= A[mid]) first = ++mid;
            else last = mid;
        }
        return first;
    }
}
