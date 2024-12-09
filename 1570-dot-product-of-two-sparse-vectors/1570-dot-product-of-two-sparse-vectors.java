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
        while (i < vals.size()) {
            //System.out.println(vals.get(i)[0]);
            int idx = idx = find(vec.vals, vals.get(i)[0]);
            if (idx != -1) {
                
                sum += (vals.get(i)[1] * vec.vals.get(idx)[1]);
            }
            i++;
        }
        
        return sum;
    }
    
    private int find(List<int[]> vals, int target) {
        int s = 0;
        int e = vals.size() - 1;
        
        while (s <= e) {
            int mid = (s + e) / 2;
            //System.out.println(mid);
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