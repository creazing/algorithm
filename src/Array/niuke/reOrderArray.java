package Array.niuke;

import java.util.ArrayList;

/**
 * 题目：输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 * 思路：
 * 当不要求稳定性的时候可以用双指针
 * 创建一个数组存储偶数，老数组存储奇数，最后把偶数存进去
 */
public class reOrderArray {
    public void reOrderArray1(int[] array) {
        if (array.length == 0)
            return;
        for (int i = 0, j = array.length - 1; i < j; i++, i--) {
            while (array[i] % 2 == 1 && i < j)
                i++;
            while (array[j] % 2 == 0 && i < j)
                j--;
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public class Solution {
        public void reOrderArray2(int[] array) {
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            int j = 0;
            for (int i = 0; i <= array.length - 1; i++) {
                if (array[i] % 2 == 1)
                    array[j++] = array[i];
                else
                    tmp.add(array[i]);
            }
            for (int i : tmp) {
                array[j++] = i;
            }
        }
    }
}