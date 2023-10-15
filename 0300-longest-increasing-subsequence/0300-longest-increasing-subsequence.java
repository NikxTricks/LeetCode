class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        //Arrays.fill(dp, 1);
        int max = 0;
        int start = 0;
        while (start < nums.length - 1 && nums[start] > nums[start + 1]) {
            start++;
        }
        for (int i = start; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    max = Math.max(dp[i], max);
                }
            }
        }
        
        return ++max;
    }
    
    

}