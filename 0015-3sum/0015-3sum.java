class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> data = new HashSet<>();
        Set<List<Integer>> out = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int target = 0 - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                boolean cur = data.contains(target - nums[j]);
                if (!cur) {
                    data.add(nums[j]);
                }
                else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[j]);
                    temp.add(nums[i]);
                    temp.add(target - nums[j]);
                    
                    Collections.sort(temp);
                    out.add(temp);
                }
            }
            data = new HashSet<>();
        }
        return out.stream().toList();
    }
}