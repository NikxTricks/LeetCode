class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        int[] data = new int[cost.length];
        return Math.min(helper(cost.length - 1, cost, data), helper(cost.length - 2, cost, data));
    }
    
    public int helper(int n, int[] cost, int[] data) {
        if (n < 0) {
            return 0;
        }
        if (n <= 1) {
           return cost[n]; 
        }
        if (data[n] != 0) {
            return data[n];
        }
        
        int out = cost[n] + Math.min(helper(n - 1, cost, data), helper(n - 2, cost, data));
        data[n] = out;
        return out;
        
        
        
        
    }
}