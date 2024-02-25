class Solution {
    public int maxProduct(int[] nums) {
        int[] minDP = new int[nums.length];
        int[] maxDP = new int[nums.length];
        minDP[0] = nums[0];
        maxDP[0] = nums[0];
        int max = maxDP[0];
        for (int i = 1; i < nums.length; i++) {
            minDP[i] = Math.min(nums[i], Math.min(minDP[i - 1] * nums[i], maxDP[i - 1] * nums[i]));
            maxDP[i] = Math.max(nums[i], Math.max(minDP[i - 1] * nums[i], maxDP[i - 1] * nums[i]));
            max = Math.max(max, maxDP[i]);
        }
        
        return Math.max(max, maxDP[nums.length - 1]);
    }

}