
class Solution {
    public void moveZeroes(int[] nums) {
        int skipped = 0;
        int start = 0;
        while (start < nums.length && nums[start] != 0) {
            start++;   
        }
        int j = start;
        for (int i = start; i < nums.length-skipped; i++) {
            while (j < nums.length && nums[j] == 0) {
                skipped++;
                j++;
            }
            if (j < nums.length) {
                nums[i] = nums[j];
                nums[j] = 0;
                j++; 
            }

        } 
        
        

        
        

    }
}