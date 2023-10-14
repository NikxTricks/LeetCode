class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (dp[i] == true) {
                    continue;
                }
                if (nums[j] >= i - j && dp[j] == true) {
                    dp[i] = true;
                }
            }
        }
        
        return dp[nums.length - 1];
    }
}