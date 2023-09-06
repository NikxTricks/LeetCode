class Solution {
    public int findPeakElement(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    
    public int helper(int[] nums, int start, int end) {
      if (start == end)  {
          return start;
      }
    
        int mid = (start + end)/2;
        
    if (nums[mid] > nums[mid + 1] && (start == mid || nums[mid] > nums[mid - 1])) { 
	    return mid; 
    } 
    else if (nums[mid] < nums[mid + 1]) {
        return helper(nums, mid + 1, end);
    }
    else {
        return helper(nums, start, mid - 1);
    }
        
        
    
    }
    
}