class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        PriorityQueue<int[]> order = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        for (int[] interval: intervals) {
            order.add(interval);
        }
    
        int prev = 0;
       while (order.size() > 0) {
           int[] cur = order.remove();
           if (prev > cur[0]) {
               return false;
           }
           prev = cur[1];
       }
        
        
        return true;
    
    }
}