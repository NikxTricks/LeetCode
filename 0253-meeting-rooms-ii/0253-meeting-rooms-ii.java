import java.util.Set;
import java.util.LinkedList;
class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int max = 1;
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> order = new PriorityQueue<>();
        for (int[] meetingTime: intervals) {
            if (order.size() > 0 && meetingTime[0] >= order.peek()) {
                order.remove();
            }
            order.add(meetingTime[1]);
            max = Math.max(max, order.size());
        }
        
        return max;
        
    }
}