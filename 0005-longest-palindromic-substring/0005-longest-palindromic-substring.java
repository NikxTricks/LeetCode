class Solution {
    public String longestPalindrome(String s) {
        int m = s.length();
        String max = s.substring(0, 1);
        boolean[][] dp = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            dp[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (i - j <= 2 || dp[j + 1][i - 1]) {
                        dp[j][i] = true;
                        String out = s.substring(j, i + 1);
                        if (out.length() > max.length()) {
                            max = out;
                        }
                    }
                }
            }
        }
        
        return max;
        
        
        
    }
}