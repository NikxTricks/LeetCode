class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        std::vector<int> dp(n);
        
        for (int i = 1; i < n; i++) {
            if (prices[i - 1] >= prices[i]) {
                dp[i] = dp[i - 1];
            }
            else {
                dp[i] = dp[i - 1] + (prices[i] - prices[i - 1]);
            }
        }
        
        return dp[n - 1];
    }
};