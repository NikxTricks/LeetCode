class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    helper(grid, i, j);
                }
            }
        }
        
        return count;
    }
    
    
    public void helper(char[][] grid, int i, int j) {
        if (grid[i][j] == '0' || grid[i][j] == '2') {
            return;
        }
        grid[i][j] = '2';
        if (i + 1 < grid.length) {
            helper(grid, i + 1, j);
        }
        if (i - 1 >= 0) {
            helper(grid, i - 1, j);
        }
        if (j + 1 < grid[0].length) {
            helper(grid, i, j + 1);
        }
        if (j - 1 >= 0) {
            helper(grid, i, j - 1);
        }
        
    }
}