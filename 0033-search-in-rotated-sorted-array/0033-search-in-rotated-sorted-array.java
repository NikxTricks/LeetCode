class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
    
    
    int helper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
      int mid = (start + end)/2;
        
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[start] == target) {
           return start; 
        }
        if (nums[end] == target) {
            return end;
        }
    
        if (nums[mid] > nums[end]) {
            if (target > nums[mid] || target < nums[end]) {
                return helper(nums, target, mid + 1, end - 1);
            }
            else {
                return helper(nums, target, start + 1, mid - 1);
            }
        }
        if (target > nums[mid] && target < nums[end]) {
            return helper(nums, target, mid + 1, end - 1);
        }
        else {
            return helper(nums, target, start + 1, mid - 1);
        }
    }
}