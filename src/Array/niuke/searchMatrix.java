package Array.niuke;

/**
 * 题目：在一个二维数组中（每个一维数组的长度相同），每一行都按照从左
 * 到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个
 * 函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路：从右上角开始，如果比目标值大则往左移，如果比目标值小则往下移动
 */
public class searchMatrix {
    public static boolean Find(int target, int [][] array) {
        if(array.length ==0 || array[0].length ==0)
            return false;
        int i= 0, j=array[0].length-1;
        while(i<array.length && j>=0){
            if(target>array[i][j])
                i++;
            else if(target<array[i][j]){
                j--;
            }
            else
                return true;

        }
        return false;
    }
}
