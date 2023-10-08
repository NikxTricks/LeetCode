class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] data1 = new int[nums.length - 1];
        int[] data2 = new int[nums.length];
        Arrays.fill(data1, -1);
        Arrays.fill(data2, -1);
        
            return Math.max(helper(nums.length - 2, Arrays.copyOfRange(nums, 1, nums.length), data1), helper(nums.length - 2, nums, data2));

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