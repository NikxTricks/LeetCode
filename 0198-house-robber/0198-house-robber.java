class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] data = new int[nums.length];
        data[0] = nums[0];
        data[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            data[i] = Math.max(data[i - 2] + nums[i], data[i - 1]);
        }
        
        return data[nums.length - 1];
    }
    
}