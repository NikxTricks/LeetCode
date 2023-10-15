class Solution {
    public int lengthOfLIS(int[] nums) {
        //optimize with binary search
        int[] dp = new int[nums.length];
        int max = 0;
        int i = 0;
        while (i < nums.length - 1 && nums[i] > nums[i + 1]) {
            i++;
        }
        while (i < nums.length) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(dp[i], max);
                }
            }
            i++;
        }
        
        return ++max;
    }
    
    

}