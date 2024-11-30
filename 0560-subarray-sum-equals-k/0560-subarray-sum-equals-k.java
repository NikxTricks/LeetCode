class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> sums = new HashMap<>();
        sums.put(0, 1);
        
        int sum = 0;
        for (int num: nums) {
            sum += num;
            int add = sums.getOrDefault(sum - k, 0);
            count += add;
            
            sums.put(sum, sums.getOrDefault(sum, 0) + 1);
        }

        
        return count;
    }
}