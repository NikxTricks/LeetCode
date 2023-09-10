class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }
    
    
    int helper(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
   
        
        if (nums[(start + end)/2] == target) {
            return  (start + end)/2;
        }
        if (nums[start] == target) {
           return start; 
        }
        if (nums[end] == target) {
            return end;
        }
    
        if (nums[(start + end)/2] > nums[end]) {
            if (target > nums[(start + end)/2] || target < nums[end]) {
                return helper(nums, target,  (start + end)/2 + 1, end - 1);
            }
            else {
                return helper(nums, target, start + 1,  (start + end)/2 - 1);
            }
        }
        if (target > nums[(start + end)/2] && target < nums[end]) {
            return helper(nums, target,  (start + end)/2 + 1, end - 1);
        }
        else {
            return helper(nums, target, start + 1,  (start + end)/2 - 1);
        }
    }
}