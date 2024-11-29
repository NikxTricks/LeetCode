class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] out = new int[m + n];
        
        
        int i = 0;
        int j = 0;
        
        while (i < m & j < n) {
            if (nums1[i] > nums2[j]) {
                out[i + j] = nums2[j];
                j++;
            }
            else {
                out[i + j] = nums1[i];
                i++;
            }
        }
        
        while (i < m) {
            out[i + j] = nums1[i];
            i++;
        }
        
        while (j < n) {
            out[i + j] = nums2[j];
            j++;
        }
        
        for (int idx = 0; idx < m + n; idx++) {
            nums1[idx] = out[idx];
        }
    }
}