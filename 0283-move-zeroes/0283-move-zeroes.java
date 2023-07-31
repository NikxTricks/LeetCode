
class Solution {
    public void moveZeroes(int[] nums) {
        int removed = 0;
        for (int i = 0; i < nums.length - removed; i++) {
            if (nums[i] == 0) {
                for (int j = i; j < nums.length - removed - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - removed - 1] = 0;
                removed++;
                i--;
            } 

            
        }
    }
}