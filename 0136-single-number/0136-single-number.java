import java.util.List;
class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = data.getOrDefault(nums[i], 0);
                data.put(nums[i], count + 1);
        }
        
        for (Integer num: data.keySet()) {
            if (data.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }
}