class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 1;
        int j = nums.length;
        int[] prefix = new int[j];
        int[] out = new int[j];
        prefix[0] = nums[0];
        int suffix = nums[j - 1];

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