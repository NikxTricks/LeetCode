class Solution {
    public int maxProduct(int[] nums) {
        // Initialize minDP and maxDP arrays to store the minimum and maximum product up to each index
        int[] minDP = new int[nums.length];
        int[] maxDP = new int[nums.length];
        minDP[0] = nums[0];
        maxDP[0] = nums[0];
        
        // Initialize the result with the first element
        int result = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            // Calculate the minimum and maximum products up to index i by considering the current number itself,
            // the product of the current number and the previous maximum product, and
            // the product of the current number and the previous minimum product.
            minDP[i] = Math.min(nums[i], Math.min(minDP[i - 1] * nums[i], maxDP[i - 1] * nums[i]));
            maxDP[i] = Math.max(nums[i], Math.max(minDP[i - 1] * nums[i], maxDP[i - 1] * nums[i]));
            
            // Update the result with the maximum product found so far
            result = Math.max(result, maxDP[i]);
        }
        
        return result;
    }

}