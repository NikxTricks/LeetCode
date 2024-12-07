class Solution {
    public void nextPermutation(int[] nums) {
        int p = nums.length - 2;
        while (p >= 0 && nums[p] >= nums[p + 1]) {
            p--;
        }
        //System.out.println(p);
        if (p >= 0) {
            int min = Integer.MAX_VALUE;
            int idx = -1;
            for (int i = p; i < nums.length; i++) {
                if (nums[p] < nums[i] && nums[i] <= min) {
                    min = nums[i];
                    idx = i;
                }
            }
            int temp = nums[idx];
            nums[idx] = nums[p];
            nums[p] = temp;
            //System.out.println(idx);
            //Arrays.sort(nums, p + 1, nums.length);
        }
        
        reverse(nums, p + 1, nums.length - 1);
    }
    
    private void reverse(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}