class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    count++;
                    helper(grid, i, j, visited);
                }
            }
        }
        
        return count;
    }
    
    
    public void helper(char[][] grid, int i, int j, boolean[][] visited) {
        if (grid[i][j] == '0' || visited[i][j] == true) {
            return;
        }
        visited[i][j] = true;
        if (i + 1 < grid.length) {
            helper(grid, i + 1, j, visited);
        }
        if (i - 1 >= 0) {
            helper(grid, i - 1, j, visited);
        }
        if (j + 1 < grid[0].length) {
            helper(grid, i, j + 1, visited);
        }
        if (j - 1 >= 0) {
            helper(grid, i, j - 1, visited);
        }
        
    }
}