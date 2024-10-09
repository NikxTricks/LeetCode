class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] dp = new int[n];
        
        dp[0] = 0;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (prices[j] >= prices[i]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
                else {
                    dp[i] = Math.max(dp[i], dp[j] + (prices[i] - prices[j]));
                }
            }
        }
        
        return dp[n - 1];
    }
}