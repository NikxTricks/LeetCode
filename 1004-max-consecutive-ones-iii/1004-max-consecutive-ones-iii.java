class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int prev = 0;
        int count = 0;
        
        int max = 0;
        if (nums[i] == 0) {
            count++;
        }
        while (i < nums.length) {
            while (i < nums.length && count - k <= 0) {
                i++;
                if (i < nums.length && nums[i] == 0) {
                    count++;
                }
            }
            
            max = Math.max(max, i - prev);
            
            while (prev < nums.length && count - k > 0) {
                if (nums[prev] == 0) {
                    count--;
                }
                prev++;
            }
        }
        
        return max;
    }
}