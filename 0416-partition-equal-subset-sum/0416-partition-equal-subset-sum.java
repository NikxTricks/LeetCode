class Solution {
    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int num: nums) {
            total += num;
        }
        if (total % 2 == 1) {
            return false;
        }
        boolean[] dp = new boolean[total/2 + 1];
        dp[0] = true;
        for (int i = 0; i < nums.length; i++) {
            for (int j = dp.length - 1; j >= 0; j--) {
                if (dp[j] && j + nums[i] < dp.length) {
                    dp[j + nums[i]] = true;
                }
            }
        }
        return dp[dp.length - 1];
    }
}