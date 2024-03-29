class Solution {
    public String longestPalindrome(String s) {
        int m = s.length();
        int max = 1;
        int start = 0;
        int end = 1;
        boolean[][] dp = new boolean[m][m];
        for (int i = 0; i < m; i++) {
            dp[i][i] = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (i - j <= 2 || dp[j + 1][i - 1]) {
                        dp[j][i] = true;
                        if (i - j + 1 > max) {
                            max = i - j + 1;
                            start = j;
                            end = i + 1;
                        }
                    }
                }
            }
        }
        
        return s.substring(start, end);
        
        
        
    }
}