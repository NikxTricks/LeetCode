class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        
        List<int[]> data = new LinkedList<int[]>();
        for (int[] interval: intervals) {
            data.add(interval);
        }
        
        Collections.sort(data, (a, b) -> {
            int out = a[1] - b[1];
            if (out == 0) {
                out = a[0] - b[0];
            }
            return out;
        });
        
        int size = data.size();
        int i = 0;
        while (i < size - 1) {
        if (data.get(i)[0] == data.get(i + 1)[0] || data.get(i)[1] > data.get(i + 1)[0]) {
                count++;
            if (data.get(i + 1)[1] - data.get(i + 1)[0] > data.get(i)[1] - data.get(i)[0]) {
                data.remove(i + 1);
            }
            else {
                data.remove(i + 1);
            }
                
                size--;
            
            }
            else {
                i++;
            }
        }

        
        return count;
    }
}