class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> out = new LinkedList<>();
        int i = 0;
        while (i < nums.length) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            int k = i + 1;
            int j = nums.length - 1;
            while (k < j) {
            if (k > i + 1 && nums[k] == nums[k - 1]) {
                k++;
                continue;
            }
                if (nums[i] + nums[j] + nums[k] == 0) {
                   out.add(new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    k++;
               }  
                else if (nums[i] + nums[j] + nums[k] < 0) {
                   k++;
               }
                else {
                    j--;
                }
            }
            i++;
        }
        
        
        
        return out;
    }
}