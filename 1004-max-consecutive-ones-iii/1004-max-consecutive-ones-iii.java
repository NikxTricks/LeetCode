class Solution {
    public int longestOnes(int[] nums, int k) {
        int s = 0;
        int e = 0;
        
        
        int count = 0;
        while (e < nums.length) {
            if (nums[e] == 0) {
               count++; 
            }
            
            if (count > k) {
                if (nums[s] == 0) {
                    count--;
                }
                s++;
            }
            e++;
        }
        
        return e - s;
    }
}