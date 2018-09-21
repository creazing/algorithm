package Dynamic;

/**
 * 问题：给定一个字符串，最少切割多少次可以将其分割多个回文（最坏是单个的字符为一个组）
 * 思路：基于最长回文的动态规划，用pal数组记录ij间是不是回文，用cut数组记录前i个字符串
 * 进行切割需要的次数（包含i字符串）
 * cut[i] =min(cut[j]+1) ji间为回文，j为小于i的数
 */
public class  PalindromePartitioning {
    public int minCut(String s) {
        char[] c = s.toCharArray();
        int n = c.length;
        int[] cut = new int[n];
        boolean[][] pal = new boolean[n][n];

        for(int i = 0; i < n; i++) {
            int min = i;//最多切这么多次
            for(int j = 0; j <= i; j++) {
                if(c[j] == c[i] && (j + 1 > i - 1 || pal[j + 1][i - 1])) {
                    pal[j][i] = true;
                    min = j == 0 ? 0 : Math.min(min, cut[j - 1] + 1);//如果此区间本身就是回文，则不用切割
                }
            }
            cut[i] = min;
        }
        return cut[n - 1];
    }
}