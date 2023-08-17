class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> out = new LinkedList<>();
        int target = 0;
        while (target < nums.length - 2) {
            if (target > 0 && nums[target] == nums[target - 1]) {
                target++;
                continue;   
            }
            int i = target + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[target];
                if (sum == 0) {
                    out.add(Arrays.asList(nums[target], nums[i], nums[j]));
                    // Increment i and decrement j after finding a triplet
                    i++;
                    j--;
                    // Skip duplicates for i
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++; 
                    }
                    // Skip duplicates for j
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (sum < 0) {
                    i++;
                } else {
                    j--;
                }
            }
            target++;
        }

        return out;
    }
}
