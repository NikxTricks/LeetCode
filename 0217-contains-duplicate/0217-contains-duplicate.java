class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashMap<Integer, Integer> data = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = data.getOrDefault(nums[i], 0);
                data.put(nums[i], count + 1);
        }
        
        return data.size() != nums.length;
    }
}