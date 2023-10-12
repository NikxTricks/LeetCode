class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
           return Math.max(nums[0], nums[1]); 
        }
        
        int[] data1 = new int[nums.length - 1];
        data1[0] = nums[0];
        data1[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length - 1; i++) {
            data1[i] = Math.max(data1[i - 2] + nums[i], data1[i - 1]);
        }
        int[] data2 = new int[nums.length - 1];
        data2[0] = nums[1];
        data2[1] = Math.max(nums[1], nums[2]);
        for (int i = 2; i < nums.length - 1; i++) {
            data2[i] = Math.max(data2[i - 2] + nums[i + 1], data2[i - 1]);
        }
        
        
        
            return Math.max(data1[nums.length - 2], data2[nums.length - 2]);

    }

}