package Bit;

/**
 * 位运算：&、|、~、^;>>：右移（符号位不变）<<:左移符号位不边
 * >>>:右移符号位一起移动
 * 问题1：数组中有一个数出现了一次，其他都是出现偶数次，求出现一次的那个数
 * 思路：所有数和0异或都是它本身，自己异或结果为0
 * 问题2：有两个个数出现了一次，其他数出现了三次，求出现1次的两个数
 * 思路：所有数的异或记过就是x^y（肯定不为0，因为这两个不相等）
 * 找到不为0的那一位，可以将x和y分开，然后可以求出x^y^x=y;在x^y^y就可得到x
 * 问题3：有一个出现了1次，其他都是出现3次求出出现1次的
 * 思路1：将每个树的位相加，结果取模3因为出现3的整数次相当于给删除了，最后再把结果合并了
 */
public class SingleNumber {
    public static int singleNumber1(int[] nums) {
        int x = 0;
        for (int i : nums) {
            x = x ^ i;
        }
        return x;
    }

    public int[] singleNumber2(int[] nums) {
        int xorRes1 = 0;
        //得到x^y的结果
        for (int i : nums) {
            xorRes1 ^= i;
        }
        //展出不为0的位
        int k = 0;
        while (k < Integer.SIZE) {
            if ((xorRes1 >>> k & 1) == 1)
                break;
            k++;
        }
        //得出k为为1的数与xorRes1与的结果，也就是x^y^x=y,得出其中一个数
        int xorRes2 = 0;
        for (int i : nums) {
            if ((i >>> k & 1) == 1)
                xorRes2 ^= i;
        }
        return new int[]{xorRes2, xorRes1 ^ xorRes2};
    }
    public int singleNumber3(int[] nums) {
        final int W = Integer.SIZE; // 一个整数的bit数，即整数字长
        int[] count = new int[W]; // count[i]表示在在i位出现的1的次数
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < W; j++) {
                count[j] += (nums[i] >> j) & 1;
                count[j] %= 3;
            }
        }
        int result = 0;
        for (int i = 0; i < W; i++) {
            result += (count[i] << i);
        }
        return result;
    }
}

