class Solution {
    public int longestOnes(int[] nums, int k) {
        int e = 0;
        int s = 0;
        
        int dist = 0;
        int count = 0;
        while (e < nums.length) {
            while (e < nums.length && count <= k) {
                if (nums[e] == 0) {
                    count++;
                }
                e++;
            }
            // if (count > k) {
                dist = Math.max(dist, e - s - 1);
            // }
            // else {
            //     dist = Math.max(dist, e - s);
            // }
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