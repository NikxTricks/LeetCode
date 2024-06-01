class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0;
        int prev = Integer.MIN_VALUE;
        for (int[] interval: intervals) {
                if (prev <= interval[0]) {
                    prev = interval[1];
                }
                else {
                    count++;
                }
            }
        
        
        return count;
    }
}