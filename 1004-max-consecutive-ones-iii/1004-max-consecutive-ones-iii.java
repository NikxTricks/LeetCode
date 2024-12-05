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
            i++;
            
            if (count > k) {
                if (nums[prev] == 0) {
                    count--;
                }
                prev++;
            }
        }
        
        return i - prev;
    }
}