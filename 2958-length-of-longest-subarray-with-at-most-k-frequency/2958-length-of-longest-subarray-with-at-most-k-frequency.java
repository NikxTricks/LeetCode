class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int i = 0;
        int j = 0;
        
        Map<Integer, Integer> count = new HashMap<>();
        int max = k;
        while (j < nums.length) {
            while (j < nums.length && count.getOrDefault(nums[j], 0) + 1 <= k) {
                count.put(nums[j], count.getOrDefault(nums[j], 0) + 1);
                j++;
            }
            max = Math.max(max, j - i);
            while (j < nums.length && i < j && nums[i] != nums[j]) {
                count.put(nums[i], count.get(nums[i]) - 1);
                i++;
            }
            if (i < j) {
                count.put(nums[i], count.get(nums[i]) - 1);
                i++;
            }
        }
        return max;
    }
}