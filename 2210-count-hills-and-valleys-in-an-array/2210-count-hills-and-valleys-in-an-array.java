class Solution {
    public int countHillValley(int[] nums) {
        int total = 0;
        int n = nums.length;
        
        for (int i = 1; i < n - 1; ) {
            int j = i;
            // Find the next different element
            while (j < n - 1 && nums[j] == nums[j+1]) {
                j++;
            }
            
            if (j < n - 1 && ((nums[i-1] < nums[i] && nums[i] > nums[j+1]) || (nums[i-1] > nums[i] && nums[i] < nums[j+1]))) {
                total++;
            }
            
            // Move i to j+1 to start checking from the next different element
            i = j + 1;
        }
        
        return total;
    }
}
