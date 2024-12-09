class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        int s = i + 1;
        int e = nums.length - 1;
                
        int temp;
        if (i == -1) {
            while (s < e) {
                temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;  
                s++;
                e--;
            }
            return;
        }
    
        int idx = -1;
        int j = nums.length - 1;
        while (j > i) {
            if (nums[j] > nums[i] && (idx == -1 || nums[j] < nums[idx])) {
                idx = j;
            }
            j--;
        }
        
        temp = nums[i];
        nums[i] = nums[idx];
        nums[idx] = temp;
        
        while (s < e) {
            temp = nums[e];
            nums[e] = nums[s];
            nums[s] = temp;  
            s++;
            e--;
        }
        

        
    }
}