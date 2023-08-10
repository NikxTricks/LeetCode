class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
    
    public int helper(int[] nums, int target, int start, int end) {
        int mid = (start + end)/2;
        if (nums[mid] == target) {
            return mid;
        }
        if (mid == start) {
            if (nums[start] == target) {
                return start;
            }
            if (nums[end] == target) {
              return end;  
            }
            return -1;
        }
        if (nums[mid] > target) {
            return helper(nums, target, start, mid - 1);
        }

        return helper(nums, target, mid + 1, end);

    }
}