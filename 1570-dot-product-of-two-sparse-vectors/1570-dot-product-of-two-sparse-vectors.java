class SparseVector {
    List<int[]> vals = new ArrayList<>();
    SparseVector(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                vals.add(new int[]{i, nums[i]});
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int i = 0;
        int j = 0;
        
        int sum = 0;
        while (i < vals.size() && j < vec.vals.size()) {
            if (vals.get(i)[0] > vec.vals.get(j)[0]) {
                j++;
            }
            else if (vals.get(i)[0] < vec.vals.get(j)[0]) {
                i++;
            }
            else {
                sum += vals.get(i)[1] * vec.vals.get(j)[1];
                i++;
                j++;
            }
        }
        
        return sum;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);