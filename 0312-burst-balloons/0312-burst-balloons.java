class Solution {
    public int maxCoins(int[] nums) {
        int[] data = new int[nums.length + 2];
        int[][] dp = new int[nums.length + 2][nums.length + 2];
        
        data[0] = data[nums.length + 1] = 1;
        for (int i = 1; i < nums.length + 1; i++) {
            data[i] = nums[i - 1];
        }
        
        for (int d = 2; d < nums.length + 2; d++) {
            int i = 0;
            int j = d;
            while (i < nums.length + 2 && j < nums.length + 2) {
                for (int k = i + 1; k < j; k++) {
                    dp[i][j] = Math.max(dp[i][k] + dp[k][j] + data[i] * data[k] * data[j], dp[i][j]);
                }
                i++;
                j++;
            }
        }
        
        return dp[0][nums.length + 1];
    }
}