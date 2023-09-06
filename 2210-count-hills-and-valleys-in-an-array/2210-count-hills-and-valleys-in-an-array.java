class Solution {
    public int countHillValley(int[] nums) {
        int total = 0;
        int cur = 1;
        int i = 1;
        while (cur < nums.length - 1) {
            while (cur + i < nums.length - 1 && nums[cur] == nums[cur + i]) {
                i++;
            }
            if (nums[cur - 1] < nums[cur] && nums[cur] > nums[cur + i]) {
                total++;
            }
            else if (nums[cur - 1] > nums[cur] && nums[cur] < nums[cur + i]) {
                total++;
            }
            cur += i;
            i = 1;

        }
        
        
        return total;
    }
}