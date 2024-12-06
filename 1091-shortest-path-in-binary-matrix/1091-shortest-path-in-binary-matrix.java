class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> order = new LinkedList<>();
        
        int len = Integer.MAX_VALUE;
        
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        
        order.add(new int[]{0, 0, 1});
        while (!order.isEmpty()) {
            int[] cur = order.remove();
            if (cur[0] > grid.length - 1 || cur[1] > grid[0].length - 1 || cur[0] < 0 || cur[1] < 0) {
                continue;
            }
            if (grid[cur[0]][cur[1]] == 1 || visited[cur[0]][cur[1]]) {
                continue;
            }
            visited[cur[0]][cur[1]] = true;
            if (cur[0] == grid.length - 1 && cur[1] == grid[0].length - 1) {
                len = Math.min(cur[2], len);
                continue;
            }
            order.add(new int[]{cur[0] + 1, cur[1], cur[2] + 1}); //down
            order.add(new int[]{cur[0] - 1, cur[1], cur[2] + 1}); //up
            order.add(new int[]{cur[0], cur[1] + 1, cur[2] + 1}); //right
            order.add(new int[]{cur[0], cur[1] - 1, cur[2] + 1}); //left
            order.add(new int[]{cur[0] + 1, cur[1] + 1, cur[2] + 1}); //down and right
            order.add(new int[]{cur[0] - 1, cur[1] + 1, cur[2] + 1}); //up and right
            order.add(new int[]{cur[0] + 1, cur[1] - 1, cur[2] + 1}); //down and left
            order.add(new int[]{cur[0] - 1, cur[1] - 1, cur[2] + 1}); //up and left
        }
        
        return (len == Integer.MAX_VALUE) ? -1 : len;
    }
}