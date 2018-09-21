package Dynamic;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        int len = s.length();
        boolean[][] f = new boolean[len][len];
        int maxLen = 1, start = 0;
        for (int j = 0; j < len; j++) {
            f[j][j] = true;
            for (int i = j - 1; i >= 0; i--) {
                f[i][j] = s.charAt(i) == s.charAt(j) && (i-j<2 || f[i+1][j+1]);
                if(f[i][j]){
                    maxLen = Math.max(maxLen,j-i+1);
                    start =i;
                }
            }

        }
        return s.substring(start, start + maxLen);
    }
}
