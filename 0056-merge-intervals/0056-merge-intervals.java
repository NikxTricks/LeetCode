class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> out = new LinkedList<>();
        int cur = 0;
        int j = 1;
        while (cur < intervals.length) {
            while (j < intervals.length && intervals[cur][1] >= intervals[j][0]) {
                intervals[cur][1] = Math.max(intervals[cur][1], intervals[j][1]);
                j++;
            }
            out.add(intervals[cur]);
            cur = j;
        }
        return out.toArray(new int[out.size()][2]);
    }
}