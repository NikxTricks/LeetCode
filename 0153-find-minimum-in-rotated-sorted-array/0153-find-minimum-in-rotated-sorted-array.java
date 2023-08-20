class Solution {
    public int findMin(int[] nums) {
        int i = (nums.length )/2;
        int dis = (nums.length)/2;
        //int prev = Integer.MAX_VALUE;
        while (nums[(i - 1 + nums.length)%nums.length] < nums[i]) {
           
            if (nums[i] < nums[(i + 1 + nums.length)%nums.length]) {
                //prev = nums[i];
                i-= dis;
                i += nums.length;
                i %= nums.length;
            }
            else {
                //prev = nums[i];
                i += dis;
                i += nums.length;
                i %= nums.length;
            }
            if (dis > 1) {
               dis /= 2; 
            }
        
        }
        
        return nums[i];
                
    }
    
}