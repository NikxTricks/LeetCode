class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        
        int m = mat.length;
        int n = mat[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map.containsKey(i + j)) {
                    map.put(i + j, new LinkedList<Integer>());
                }
                
                map.get(i + j).add(mat[i][j]);
            }
        }
        
        
        int[] out = new int[m * n];
        int index = 0;
        
        for (int i = 0; i <= m + n - 2; i++) {
            List<Integer> cur = map.get(i);
            if (i % 2 == 0) {
                for (int j = cur.size() - 1; j >= 0; j--) {
                    out[index] = cur.get(j);
                    index++;
                }
            }
            else {
                for (int j = 0; j < cur.size(); j++) {
                    out[index] = cur.get(j);
                    index++;
                }
            }
        }
        
        return out;
        
    }
}