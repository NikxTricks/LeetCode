class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> order = new LinkedList<>();
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int[][] dirs = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, 1}, {1, -1}, {-1, -1}};
        
        order.add(new int[]{0, 0, 1});
        while (!order.isEmpty()) {
            int[] cur = order.remove();
            if (grid[cur[0]][cur[1]] == 1) {
                continue;
            }
            if (cur[0] == grid.length - 1 && cur[1] == grid[0].length - 1) {
                return cur[2];
            }
            for (int[] dir: dirs) {
                if (cur[0] + dir[0] >= 0 && cur[0] + dir[0] < grid.length && cur[1] + dir[1] >= 0 && cur[1] + dir[1] < grid[0].length) 
                {
                    if (!visited[cur[0] + dir[0]][cur[1] + dir[1]]) {
                        order.add(new int[]{cur[0] + dir[0], cur[1] + dir[1], cur[2] + 1});
                        visited[cur[0] + dir[0]][cur[1] + dir[1]] = true;
                    }
                }
            }
        }
        
        return -1;
    }
}