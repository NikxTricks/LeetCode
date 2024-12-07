class Solution {
    public void nextPermutation(int[] nums) {
        int p = nums.length - 2;
        while (p >= 0 && nums[p] >= nums[p + 1]) {
            p--;
        }
        if (p == -1) {
            Arrays.sort(nums);
        }
        else {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = p; i < nums.length; i++) {
                if (nums[p] < nums[i] && nums[i] < min) {
                    min = nums[i];
                    idx = i;
                }
            }
            int temp = nums[idx];
            nums[idx] = nums[p];
            nums[p] = temp;
            Arrays.sort(nums, p + 1, nums.length);
        }
    }
}