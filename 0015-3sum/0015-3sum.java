class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    HashSet<List<Integer>> data = new HashSet<>();
    List<List<Integer>> out = new LinkedList<>();
    int target = 0;
        while (target < nums.length) {
            if (target > 0 && nums[target] == nums[target] - 1) {
                target++;
                 continue;   
            }
            int i = target + 1;
            int j = nums.length - 1;

            while (i < j) {
                if (i == target) {
                   i++; 
                }
                if (j == target) {
                    j--;
                }
                if (i >= j) {
                    break;   
                }
                int sum = nums[i] + nums[j] + nums[target];
                if (sum == 0) {
                    List<Integer> triplet = new LinkedList<>(Arrays.asList(nums[i], nums[j], nums[target]));
                    Collections.sort(triplet);
                    if (!data.contains(triplet)) {
                        out.add(triplet);
                        data.add(triplet);
                    }
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
        
        return out;
    }
}