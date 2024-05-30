class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        //return new int[2][2];
        List<int[]> out = new LinkedList<>();
        if (intervals.length == 0) {
            int[][] outArr = new int[1][2];
            outArr[0] = newInterval;
            return outArr;
        }
        int[] add = new int[2];
        int i = 0;
        while (i < intervals.length && newInterval[0] > intervals[i][1] ) {
            out.add(intervals[i]);
            i++;
        }
        if (i >= intervals.length) {
            out.add(newInterval);
            int[][] done = new int[out.size()][2];
            for (int j = 0; j < out.size(); j++) {
                done[j] = out.get(j);
            }
            return done;
        }
        add[0] = Math.min(newInterval[0], intervals[i][0]);
        while (i < intervals.length && newInterval[1] > intervals[i][1]) {
            i++;
        }
        if (i >= intervals.length) {
            i--;
        }
        if (newInterval[1] < intervals[i][0]) {
            add[1] = newInterval[1];
            out.add(add);
            for (int j = i; j < intervals.length; j++) {
                out.add(intervals[j]);
            }
            int[][] done = new int[out.size()][2];
            for (int j = 0; j < out.size(); j++) {
                done[j] = out.get(j);
            }
            return done;
        }
        add[1] = Math.max(newInterval[1], intervals[i][1]);
        out.add(add);
        i++;
        for (int j = i; j < intervals.length; j++) {
            out.add(intervals[j]);
        }
        int[][] done = new int[out.size()][2];
        for (int j = 0; j < out.size(); j++) {
                done[j] = out.get(j);
        }
        return done;
        
        
    }
}