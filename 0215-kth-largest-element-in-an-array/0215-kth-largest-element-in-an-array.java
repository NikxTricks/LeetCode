class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> order = new PriorityQueue<>();
        
        
        for (int num: nums) {
            order.add(num);
            if (order.size() > k) {
                order.remove();
            }
        }
        
        return order.remove();
    }
}