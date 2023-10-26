class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        
        for (int i = 0; i < nums.length; i++) {
           maxCount += nums[i];
            max = Math.max(max, maxCount);
            maxCount = Math.max(maxCount, 0);
        }
        
        return max;
    }
}