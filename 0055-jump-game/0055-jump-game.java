class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (dp[i]) {
                for (int j = 1; j <= nums[i]; j++) {
                    if (nums[i] >= nums.length - 1 - i) {
                        return true;
                    }
                    if (i + j < nums.length) {
                        dp[i + j] = true;
                    }
                } 
            }
        }   
        
        
        return dp[nums.length - 1];
    }
}