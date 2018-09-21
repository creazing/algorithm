package Dynamic;

/**
 * 注：列更新的时候可以从上面也可以从下面，因为列的值只和前一列相关
 * 问题：求给定字符串的字长回文子串
 * 思路：动态规划，设状态为 f(i,j) ，表示区间[i,j]是否为回文串，则状态转移方程为
 * f[j][j]=1
 * f[i][j]=s[i] ==s[j] 当ij相邻
 * f[i][j]=f[i+1][j-1]
 * 第j列需要第j-1列的信息
 */
public class longestPalindrome {
    public static String longestPalindrome1(String s) {
        if(s==null||s.length()==0)
            return s;
        int len = s.length();
        boolean[][] f = new boolean[len][len];
        int maxLen = 1, start = 0;
        for (int j = 0; j < len; j++) {
            f[j][j] = true;
            for (int i = j - 1; i >= 0; i--) {
                f[i][j] = s.charAt(i) == s.charAt(j) && (j-i<2 || f[i+1][j-1]);
                if(f[i][j] && maxLen <j-i+1){
                    maxLen =j-i+1;
                    start =i;
                }
            }

        }
        return s.substring(start, start + maxLen);
    }
    public String longestPalindrome(final String s) {
        final int n = s.length();
        final boolean[][] f = new boolean[n][n];
        int maxLen = 1, start = 0; // 最长回文子串的长度，起点
        for (int i = 0; i < n; i++) {
            f[i][i] = true;
            for (int j = 0; j < i; j++) { // [j, i]
                f[j][i] = (s.charAt(j) == s.charAt(i) &&
                        (i - j < 2 || f[j + 1][i - 1]));
                if (f[j][i] && maxLen < (i - j + 1)) {
                    maxLen = i - j + 1;
                    start = j;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }
}
