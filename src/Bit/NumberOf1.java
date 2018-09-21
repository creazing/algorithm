package Bit;

/**
 * 问题：给定一个整数求有多少位1
 * 思路：一个整数家去1相当于把最低位的1变成0，最低位后面的0变成1；原数和减去1的相与相当于把最低位的1去掉
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int count = 0;
        while(n!=0){
            ++count;
            n=n&(n-1);
        }
        return count;
    }
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = 0; i < 32; ++i) {
            count += n & 1;
            n >>>= 1;
        }
        return count;
    }
}
