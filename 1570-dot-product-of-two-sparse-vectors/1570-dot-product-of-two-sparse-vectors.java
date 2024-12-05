class SparseVector {
    
    Map<Integer, Integer> vals;
    SparseVector(int[] nums) {
        vals = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                vals.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int out = 0;
        for (Map.Entry<Integer, Integer> pair: this.vals.entrySet()) {
            out += pair.getValue() * vec.vals.getOrDefault(pair.getKey(), 0);
        }
        
        return out;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);