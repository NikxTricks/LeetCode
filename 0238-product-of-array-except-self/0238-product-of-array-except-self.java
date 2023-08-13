class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 1;
        int[] prefix = new int[nums.length];
        int[] out = new int[nums.length];
        prefix[0] = nums[0];
        int suffix = nums[nums.length - 1];

        while (i < nums.length) {
            prefix[i] = nums[i] * prefix[i - 1];
            i++;
        }
        
        
        out[nums.length - 1] = prefix[nums.length - 2];
        
        for (int z = nums.length - 2; z >= 1; z--) {
            out[z] = prefix[z - 1] * suffix;
            suffix *= nums[z];
            
        }
        out[0] = suffix;
        return out;
    }
}