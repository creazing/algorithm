package Array.RotateArray;

/**
 * 题目：把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组
 * {3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所
 * 有元素都大于0，若数组大小为0，请返回0。
 * 思路1：遍历查找逆序位置
 * 思路2：二分查找，如果右侧递增则最小值肯定再包含中间节点的左边，如果左侧递增
 * 则最小值肯定再不包括中间值的右侧，当想着相等时右侧左移
 * 一定要先右侧,因为某侧递增要把最小值野包含进去，但是如果用左侧判断的话无法将其包含进去
 */
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int left = 0;
        int right = nums.length - 1;
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[right]) {
                right = mid;
            } else if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                --right;
            }
        }

        return nums[left];
    }
}
