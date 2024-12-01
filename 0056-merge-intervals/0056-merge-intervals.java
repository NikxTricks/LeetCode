class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> out = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        
        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) {
                cur[1] = Math.max(cur[1], intervals[i][1]);
            }
            else {
                out.add(cur);
                cur = intervals[i];
            }
        }
        
        out.add(cur);
        
        int[][] done = new int[out.size()][2];
        for (int i = 0; i < out.size(); i++) {
            done[i] = out.get(i);
        }
        
        return done;
    }
    
}