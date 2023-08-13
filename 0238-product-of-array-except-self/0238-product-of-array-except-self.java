class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i = 1;
        int j = nums.length - 2;
        int[] prefix = new int[j + 2];
        int[] suffix = new int[j + 2];
        int[] out = new int[j + 2];
        prefix[0] = nums[0];
        suffix[j + 1] = nums[j + 1];

        while (i < nums.length && j >= 0) {
            prefix[i] = nums[i] * prefix[i - 1];
            suffix[j] = nums[j] * suffix[j + 1];
            i++;
            j--;
        }
        
        for (int z = 0; z < nums.length; z++) {
            if (z == 0) {
                out[z] = suffix[z + 1];
                continue;
            }
            if (z == nums.length - 1) {
                out[z] = prefix[z - 1];
                continue;
            }
            
            out[z] = prefix[z - 1] * suffix[z + 1];
        }
        return out;
    }
}