class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        if (nums2.length < nums1.length) {
            int[] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    max = Math.max(max, window(nums1, nums2, i, j));
                }
            }
        }
        
        return max;
        
    }
    
    public int window(int[] nums1, int[] nums2, int s1, int s2) {
        int i = s1;
        int j = s2;
        int count = 0;
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
            count++;
        }
        
        return count;
    }
}