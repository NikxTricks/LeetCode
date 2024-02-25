class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int out = max;
        int newMin = 0;
        for (int i = 1; i < nums.length; i++) {
            newMin = Math.min(nums[i], Math.min(min * nums[i], max * nums[i]));
            max = Math.max(nums[i], Math.max(min * nums[i], max * nums[i]));
            min = newMin;
            out = Math.max(out, max);
        }
        
        return Math.max(out, max);
    }

}