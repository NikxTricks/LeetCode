class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
    Arrays.sort(nums);
    List<List<Integer>> out = new LinkedList<>();
    for (int i = 0; i < nums.length; i++) {
        int j = i + 1;
        int k = nums.length - 1;
        if (i > 0 && nums[i] == nums[i - 1]) {
            continue;
        }
        while (j < k) {
            if (j > i + 1 && nums[j] == nums[j - 1]) {
                j++;
                continue;
            }
            if (nums[i] + nums[j] + nums[k] == 0) {
                
                out.add(new LinkedList(Arrays.asList(nums[i], nums[j], nums[k])));
                j++;
            }
            else if (nums[i] + nums[j] + nums[k] < 0) {
                j++;
            }
            else {
                k--;
            }
        }
    }
        
        return out;
    }
}