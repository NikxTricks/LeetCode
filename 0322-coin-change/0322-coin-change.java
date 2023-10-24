class Solution {
    public int coinChange(int[] coins, int amount) {
        int[][] dp = new int[amount + 1][coins.length + 1];
        for (int i = 1; i <= amount; i++) {
            dp[i][0] = -1;
        }
        for (int i = 1; i <= amount; i++) {
            for (int j = 1; j <= coins.length; j++) {
                if (coins[j - 1] > i) {
                    dp[i][j] = Math.max(dp[i][j - 1], -1);
                }
                else {
                    if (dp[i][j - 1] != -1 && dp[i - coins[j - 1]][j] != -1) {
                        dp[i][j] = Math.min(dp[i][j - 1], dp[i - coins[j - 1]][j] + 1);
                    }
                    else if (dp[i - coins[j - 1]][j] != -1) {
                        dp[i][j] = dp[i - coins[j - 1]][j] + 1;
                    }
                    else if (dp[i][j - 1] != -1) {
                        dp[i][j] = dp[i][j - 1];
                    }
                    else {
                        dp[i][j] = -1;
                    }
                }
            }
        }


        return dp[amount][coins.length];
    }
}