class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 1;
        
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                count++;
                //System.out.println("Passed");
            }
            else if (nums[i] == nums[i + 1]) {
                continue;
            }
            else {
                if (count > max) {
                    max = count;
                    
                }
                count = 1;
            }
        }
        
        if (count > max) {
            return count;
        }
        return max;
        
        
            
        
        
    }
}