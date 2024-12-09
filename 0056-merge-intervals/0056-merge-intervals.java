class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        
        List<int[]> out = new ArrayList<>();
        
        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] inc = intervals[i];
            
            if (cur[1] >= inc[0]) {
                cur[1] = Math.max(cur[1], inc[1]);
            }
            else {
                out.add(cur);
                cur = inc;
            }
            
        }
        
        out.add(cur);
        
        return out.toArray(new int[out.size()][]);
    }
    
}