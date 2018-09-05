package String;

/**
 * 题目：汇编语言中有一种移位指令叫做循环左移（ROL），现在有
 * 个简单的任务，就是用字符串模拟这个指令的运算结果。对于一个给定的字符序列S，请你把其循环左移K位后
 * 的序列输出。例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。是不是很简单？OK，搞定它！
 * 思路：三次旋转
 */
public class LeftRotateString {
    public static void main(String[] args) {
        String str =LeftRotateString.LeftRotateString("cdefgab",2);
        System.out.println(str);
    }
    public static String LeftRotateString(String str,int n){
        if(str == ""||str.length()==0)
            return "";
        n = n%str.length();
        StringBuffer sb = new StringBuffer(str);
        reverse(sb,0,n-1);
        reverse(sb,n,sb.length()-1);
        reverse(sb,0,sb.length()-1);
        return sb.toString();
    }
    private static void reverse(StringBuffer sb,int left,int right){
        while(left<right){
            char ch= sb.charAt(left);
            sb.setCharAt(left++,sb.charAt(right));
            sb.setCharAt(right--,ch);
        }
    }
}
