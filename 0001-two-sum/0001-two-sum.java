import java.util.HashMap;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> data = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = data.getOrDefault(target - nums[i], -1);
            if (diff != -1) {
                int[] out = {diff, i};
                return out;
            }
            data.put(nums[i], i);
        }   
        return new int[1];
    }
}

