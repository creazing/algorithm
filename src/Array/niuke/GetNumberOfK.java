package Array.niuke;

/**
 * 题目：统计一个数字在排序数组中出现的次数。
 * 思路：找到第一个和最后一个然后相减。
 * 注意：思路是这个但是调用的函数返回的并不一定直接就是
 */
public class GetNumberOfK {
    public int GetNumberOfK(int [] array , int k) {
        int left = lower(array,k);
        if(left == array.length)
            return 0;
        return upper(array,k)-left;
    }
    private int lower(int[] array,int target){
        int left = 0,right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(array[mid]<target)
                left = mid+1;
            else
                right = mid -1;
        }
        return left;
    }

    private int upper(int[] array,int target){
        int left = 0,right = array.length-1;
        while(left<=right){
            int mid = (left+right)/2;
            if(array[mid]<=target)
                left = mid+1;
            else
                right = mid -1;
        }
        return left;
    }
}
