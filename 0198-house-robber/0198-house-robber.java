class Solution {
    public int rob(int[] nums) {
        int[] data = new int[nums.length];
        Arrays.fill(data, -1);
        return Math.max(helper(nums.length - 1, nums, data), helper(nums.length - 2, nums, data));
    }
    
    public int helper(int n, int[] nums, int[] data) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return nums[0];
        }
        if (data[n] != -1) {
            return data[n];
        }
        else {
            data[n] = Math.max(helper(n - 2, nums, data) + nums[n], helper(n - 1, nums, data));
            return data[n];
        }
    }
}