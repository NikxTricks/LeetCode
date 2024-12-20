class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m;
        int j = n;
        
        while (i > 0 & j > 0) {
            if (nums1[i - 1] < nums2[j - 1]) {
                nums1[i + j - 1] = nums2[j - 1];
                j--;
            }
            else {
                nums1[i + j - 1] = nums1[i - 1];
                i--;
            }
        }

        while (i > 0) {
            nums1[i + j - 1] = nums1[i - 1];
            i--;
        }
        
        while (j > 0) {
            nums1[i + j - 1] = nums2[j - 1];
            j--;
        }
    }
}