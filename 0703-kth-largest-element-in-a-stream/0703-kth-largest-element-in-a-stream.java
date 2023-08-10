class KthLargest {
    private PriorityQueue<Integer> data = new PriorityQueue<>();
    private int k;
    public KthLargest(int k, int[] nums) {
        for (int num: nums) {
            data.add(num);
        }
        while (data.size() > k) {
            data.remove();
        }
        this.k = k;
    }
    
    public int add(int val) {
        data.add(val);
        while (data.size() > k) {
            data.remove();
        }
        return data.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */