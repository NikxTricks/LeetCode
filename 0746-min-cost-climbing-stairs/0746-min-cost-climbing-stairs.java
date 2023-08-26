class Solution {
    int[] data;
    public int minCostClimbingStairs(int[] cost) {
        data = new int[cost.length];
        Arrays.fill(data, -1);
        return Math.min(helper(cost.length - 1, cost), helper(cost.length - 2, cost));
    }
    
    public int helper(int n, int[] cost) {
        if (n < 0) {
            return 0;
        }
        if (n <= 1) {
           return cost[n]; 
        }
        if (data[n] != -1) {
            return data[n];
        }
        
        data[n] = cost[n] + Math.min(helper(n - 1, cost), helper(n - 2, cost));
        
        return data[n];
        
        
        
        
    }
}