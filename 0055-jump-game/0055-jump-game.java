class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i]) {
                int j = i + 1;
                while (j < nums.length && j < i + 1 + nums[i]) {
                    dp[j] = true;
                    j++;
                }
                if (j == nums.length) {
                    return true;
                }
            }
        }
        
        return dp[nums.length - 1];

    } 
    
}