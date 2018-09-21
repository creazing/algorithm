package Dynamic.Subarray;


import java.util.*;

/**
 * 问题：最长公共子序列
 * 思路：动态规划
 * 递推公式：
 * if ( s1[i-1] == s2[j-1] ) //s1的最左边字符是s1[0]
 MaxLen(i,j) = MaxLen(i-1,j-1) + 1;
 else
 MaxLen(i,j) = Max(MaxLen(i,j-1),MaxLen(i-1,j) );
 MaxLen(i,j) ：第一个字符串前i个字符串和第二个字符串的前j个字符串的最大公共子序列
 输出子序列的化迈进可能的往下往左，当下左都和当前值不一样则输出，接着调到左下角
 */
public class LCS{
    public static void main(String[] args) {
    }
    public static int findLCS(String A,String B){
        int n = A.length();
        int m = B.length();
        int[][] dp = new int[n+1][m+1];
        int max =0;
        for(int i=1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                if(A.charAt(i-1)==B.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                    if(dp[i][j]>max) max = dp[i][j];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);

                }
            }
        }
        return max;
    }
}