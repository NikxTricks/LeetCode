class Solution {
    boolean[][] visited;
    boolean[][] added;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> out = new LinkedList<>();
        added = new boolean[heights.length][heights[0].length];
        visited = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (!added[i][j]) {
                    helper(heights, i, j);
                    visited = new boolean[heights.length][heights[0].length];
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (added[i][j]) {
                    out.add(new LinkedList<>(Arrays.asList(i, j)));
                }
            }
        }
        return out;
    }
    
    public int helper(int[][] heights, int i, int j) {
        visited[i][j] = true;
        int sum = 0;
        if (i - 1 < 0) {
           sum = sum | 1; 
        }
        else {
            if (heights[i - 1][j] <= heights[i][j] && !visited[i - 1][j]) {
                sum = sum | helper(heights, i - 1, j);
            }
        }
        if (i + 1 >= heights.length) {
           sum = sum | 2; 
        }
        else {
            if (heights[i + 1][j] <= heights[i][j] && !visited[i + 1][j]) {
                sum = sum | helper(heights, i + 1, j);
            }
        }
        if (j - 1 < 0) {
           sum = sum | 1; 
        }
        else {
            if (heights[i][j - 1] <= heights[i][j] && !visited[i][j - 1]) {
                sum = sum | helper(heights, i, j - 1);
            }
        }
        if (j + 1 >= heights[0].length) {
           sum = sum | 2; 
        }
        else {
            if (heights[i][j + 1] <= heights[i][j] && !visited[i][j + 1]) {
                sum = sum | helper(heights, i, j + 1);
            }
        }
        if (sum == 3 && !added[i][j]) {
            added[i][j] = true;
        }
        
        return sum;
    }
}