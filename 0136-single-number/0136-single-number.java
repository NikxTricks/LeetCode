import java.util.Set;
class Solution {
    public int singleNumber(int[] nums) {
        int cur = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            cur = cur^nums[i];
        }
        
        return cur;

    }
}