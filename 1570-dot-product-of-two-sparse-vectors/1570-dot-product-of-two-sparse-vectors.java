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
        int prev = 0;
        List<int[]> valss = (vals.size() > vec.vals.size()) ? vec.vals : vals;
        List<int[]> valsl = (vals.size() > vec.vals.size()) ? vals : vec.vals;
        while (i < valss.size()) {
            int idx = idx = find(valsl, valss.get(i)[0], prev);
            if (idx != -1) {
                prev = idx;
                sum += (valss.get(i)[1] * valsl.get(idx)[1]);
            }
            prev = (prev == -1) ? 0 : prev;
            i++;
        }
        
        return sum;
    }
    
    private int find(List<int[]> vals, int target, int s) {
        int e = vals.size() - 1;
        
        while (s <= e) {
            int mid = (s + e) / 2;
            if (vals.get(mid)[0] == target) {
                return mid;
            }
            if (vals.get(mid)[0] > target) {
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        
        
        return -1;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);