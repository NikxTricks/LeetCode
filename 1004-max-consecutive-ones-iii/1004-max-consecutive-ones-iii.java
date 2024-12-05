class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int prev = 0;
        int count = 0;
        
        int max = 0;
        while (i < nums.length) {
            if (nums[i] == 0) {
                count++;
            }
                        
            while (prev < nums.length && count > k) {
                if (nums[prev] == 0) {
                    count--;
                }
                prev++;
            }
            
            max = Math.max(max, i - prev + 1);
            i++;

        }
        
        return max;
    }
}