class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] out = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        while (i < nums1.length || j < nums2.length) {
            if (i == nums1.length) {
                out[i + j] = nums2[j++];
                continue;
            }
            if (j == nums2.length) {
                out[i + j] = nums1[i++];
                continue;
            }
            if (nums1[i] < nums2[j]) {
                out[i + j] = nums1[i++];
            }
            else {
                out[i + j] = nums2[j++];
            }
        }
        
        if (out.length%2 == 0) {
            return (out[out.length/2] + out[out.length/2 - 1])/ (double) 2;
        }
        else {
            return out[out.length/2];
        }
    }
}