class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int count = n;
        for (int i = 0; i < s.length(); i++) {
            dp[i][i] = 1;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    if (i - j <= 2 || dp[j + 1][i - 1] == 1) {
                        dp[j][i] = 1;
                        count++;
                    }
                }
            }
        }
        return count;
    }
}