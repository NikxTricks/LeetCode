class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        
        int s = i + 1;
        int e = nums.length - 1;
        
        System.out.println(i);
        
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
    
        int closest = Integer.MAX_VALUE;
        int idx = -1;
        int j = nums.length - 1;
        while (j > i) {
            if (nums[j] < closest && nums[j] > nums[i]) {
                closest = nums[j];
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