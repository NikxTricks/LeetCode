class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> out = new LinkedList<>();
        int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1] ) {
            out.add(intervals[i]);
            i++;
        }
        if (i < intervals.length) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
        } 
        while (i < intervals.length && newInterval[1] >= intervals[i][0]) {
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        out.add(newInterval);
        for (int j = i; j < intervals.length; j++) {
            out.add(intervals[j]);
        }
        return out.toArray(new int[out.size()][]);
        
    }
}