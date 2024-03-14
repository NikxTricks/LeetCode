import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        int[] values = new int[2];
        int[] indicies = {-1, -1};
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] == target) {
               values[0] = nums[i]; 
                values[1] = nums[j];
            }
            if (nums[i] + nums[j] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        
        for (int k = 0; k < nums.length; k++) {
            if (indicies[0] == -1 && values[0] == temp[k]) {
                indicies[0] = k;
            }
            else if (indicies[1] == -1 && values[1] == temp[k]) {
                indicies[1] = k;
            }
        }
        
        return indicies;
        
        
        
    }
}

