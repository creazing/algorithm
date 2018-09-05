package Array.niuke;

/**
 * 题目：数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 * 例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现
 * 了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 * 思路：利用摩尔投票法
 */
public class MoreThanHalfNum {
    public int MoreThanHalfNum_Solution(int [] array) {
        int count = 0,cur=0;
        for(int i:array){
            if(count == 0)
            {
                cur = i;
                count++;
            }
            if(i==cur)
                count++;
            else
                count--;
        }
        count = 0;
        for(int i:array){
            if(cur==i)
                count++;
        }
        if(count>array.length/2)
            return cur;
        return 0;
    }
}

