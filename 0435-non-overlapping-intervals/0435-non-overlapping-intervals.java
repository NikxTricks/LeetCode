class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        //solve using DP
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int[] dp = new int[intervals.length];
        dp[0] = 1;
        int prev = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            dp[i] = dp[i - 1];
                    if (prev <= intervals[i][0]) {
                        dp[i] = dp[i - 1] + 1;
                        prev = intervals[i][1];
                    }
                    
            }
        
        return intervals.length - dp[intervals.length - 1];
    }
}