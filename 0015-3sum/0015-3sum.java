class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    HashSet<List<Integer>> data = new HashSet<>();
    List<List<Integer>> out = new LinkedList<>();
    int target = 0;
        while (target < nums.length - 2) {
            int i = target + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[target];
                if (sum == 0) {
                        data.add(Arrays.asList(nums[i], nums[j], nums[target]));
                    i++;
                    j--;
                    continue;
                }
                if (sum < 0) {
                    i++;
                }
                else {
                    j--;
                }
            }
            target++;
        }
        out.addAll(data);
        return out;
    }
}