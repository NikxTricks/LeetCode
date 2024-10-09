class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n = prices.size();
        //std::vector<int> dp(n);
        int prev = 0;
        
        for (int i = 1; i < n; i++) {
            if (prices[i - 1] < prices[i]) {
                prev += (prices[i] - prices[i - 1]);
            }
        }
        
        return prev;
    }
};