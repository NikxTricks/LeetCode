class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals, (a, b) -> {
            int out = a[0] - b[0];
            if (out == 0) {
                out = a[1] - b[1];
            }
            return out;
        });
        
        List<int[]> out = new LinkedList<>();
        
        int min = intervals[0][0];
        int max = intervals[0][1];
        
        for (int i = 1; i < intervals.length; i++) {
            if (max >= intervals[i][0]) {
                max = Math.max(max, intervals[i][1]);
            }
            else {
                out.add(new int[]{min, max});
              min =  intervals[i][0]; 
                max = intervals[i][1];
            }
        }
        
        if (min != -1) {
            out.add(new int[]{min, max});
        }
        return out.toArray(new int[out.size()][]);
    }
}