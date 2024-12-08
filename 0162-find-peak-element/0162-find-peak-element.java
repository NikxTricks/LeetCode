class Solution {
    public int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        
        while (s < e) {
            int mid = s + (e - s) / 2;
            //System.out.println(mid);
            
            long prev = (mid - 1 >= 0) ? nums[mid - 1] : Long.MIN_VALUE;
            long next = (mid + 1 < nums.length) ? nums[mid + 1] : Long.MIN_VALUE;
            
            if (nums[mid] > prev && nums[mid] > next) {
                return mid;
            }
            if (nums[mid] > prev && nums[mid] < next) {
                s = mid + 1;
            }
            else {
                e = mid;
            }
        }
        
        
        return s;
    } 
}