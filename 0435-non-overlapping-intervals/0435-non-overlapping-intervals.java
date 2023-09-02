class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        
        Arrays.sort(intervals, (a, b) -> {
            int out = a[1] - b[1];
            if (out == 0) {
                out = a[0] - b[0];
            }
            return out;
        });                
        
        int i = 1;
        int cur = 0;
        
        while (i < intervals.length) {
        if (intervals[cur][0] == intervals[i][0] || intervals[cur][1] > intervals[i][0]) {
                count++;
        }
        else {
            cur = i;
        }
        i++;
        }
        
        return count;
    }
}