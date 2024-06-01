class Solution {
    public int[][] merge(int[][] intervals) {
        //implement using in-place array (copy of array)
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        //List<int[]> out = new ArrayList<>();
        int cur = 0;
        int j = 1;
        int index = 0;
        while (cur < intervals.length) {
            while (j < intervals.length && intervals[cur][1] >= intervals[j][0]) {
                intervals[cur][1] = Math.max(intervals[cur][1], intervals[j][1]);
                j++;
            }
            intervals[index] = intervals[cur];
            cur = j;
            index++;
        }
        return Arrays.copyOf(intervals, index);
    }
    
}