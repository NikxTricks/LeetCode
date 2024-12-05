class SparseVector {
    
    int[] nums;
    Set<Integer> idx;
    SparseVector(int[] nums) {
        this.nums = nums;
        this.idx = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                idx.add(i);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int out = 0;
        for (int i = 0; i < this.nums.length; i++) {
            if (vec.idx.contains(i) || this.idx.contains(i)) {
                continue;
            }
            out += this.nums[i] * vec.nums[i];
        }
        
        return out;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);