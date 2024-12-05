class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> order = new PriorityQueue<>();
        
        
        for (int num: nums) {
            if (order.size() < k) {
                order.add(num);
            }
            else if (order.peek() < num) {
                order.remove();
                order.add(num);
            }
        }
        
        return order.remove();
    }
}