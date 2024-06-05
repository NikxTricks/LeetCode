class Solution {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(max, i + nums[i]);
            }
        }
        
        return max >= nums.length - 1;

    } 
    
}