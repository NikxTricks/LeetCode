class SparseVector {
    
    Map<Integer, Integer> vals;
    SparseVector(int[] nums) {
        vals = new TreeMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                vals.put(i, nums[i]);
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int out = 0;
        Map<Integer, Integer> iter = (this.vals.size() > vec.vals.size()) ? vec.vals : this.vals;
        Map<Integer, Integer> other = (this.vals.size() > vec.vals.size()) ? this.vals : vec.vals;
        for (Map.Entry<Integer, Integer> pair: iter.entrySet()) {
            out += pair.getValue() * other.getOrDefault(pair.getKey(), 0);
        }
        
        return out;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);