class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            if (dp[i]) {
                //System.out.println(nums[i]);
                for (int j = 1; j <= nums[i]; j++) {
                    if (i + j < nums.length) {
                        dp[i + j] = true;
                    }
                   // System.out.println(i + j);
                } 
            }
        }   
        
        
        return dp[nums.length - 1];
    }
}