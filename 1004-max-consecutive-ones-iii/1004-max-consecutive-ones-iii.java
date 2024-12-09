class Solution {
    public int longestOnes(int[] nums, int k) {
        int s = 0;
        int e = 0;
        
        int count = 0;
        int dist = 0;
        while (e < nums.length) {
            while (e < nums.length && count <= k) {
                if (nums[e] == 0) {
                    count++;
                }
                e++;
            }
            dist = Math.max(dist, e - s - 1);
            
            while (s < nums.length && count > k) {
                if (nums[s] == 0) {
                    count--;
                }
                s++;
            }
        }
        
        return Math.max(dist, e - s);
    }
}