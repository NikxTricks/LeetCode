class Solution {
    public void nextPermutation(int[] nums) {
        int p = nums.length - 2;
        while (p >= 0 && nums[p] >= nums[p + 1]) {
            p--;
        }
        if (p >= 0) {
            int idx = -1;
            for (int i = nums.length - 1; i > p; i--) {
                if (nums[p] < nums[i]) {
                    idx = i;
                    break;
                }
            }
            int temp = nums[idx];
            nums[idx] = nums[p];
            nums[p] = temp;
        }
        
        reverse(nums, p + 1, nums.length - 1);
    }
    
    private void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}