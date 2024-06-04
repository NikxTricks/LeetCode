class Solution {
    boolean[][] Pstatus;
    boolean[][] Astatus;
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> out = new ArrayList<>();
        Pstatus = new boolean[heights.length][heights[0].length];
        Astatus = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                boolean[][] visitedA = new boolean[heights.length][heights[0].length];
                boolean[][] visitedB = new boolean[heights.length][heights[0].length];
                if (dfsA(i, j, heights, Integer.MAX_VALUE, visitedA) && dfsP(i, j, heights, Integer.MAX_VALUE, visitedB)) {
                    List<Integer> coord = new ArrayList<>();
                    coord.add(i);
                    coord.add(j);
                    out.add(coord);
                }
            }
        }
        
        return out;
    }
    
    
    public boolean dfsA(int i, int j, int[][] heights, int prev, boolean[][] visited) {
        if (i >= heights.length || j >= heights[0].length || i < 0 || j < 0) {
            return false;
        }
        if (heights[i][j] > prev) {
            return false;
        }
        if (Astatus[i][j]) {
            return true;
        }
        if (visited[i][j]) {
            return Astatus[i][j];
        }
        visited[i][j] = true;
        if (i >= heights.length - 1 || j >= heights[0].length - 1) {
            Astatus[i][j] = true;
            return true;
        }
        Astatus[i][j] = dfsA(i - 1, j, heights, heights[i][j], visited) || dfsA(i, j + 1, heights, heights[i][j], visited) || dfsA(i + 1, j, heights, heights[i][j], visited) || dfsA(i, j - 1, heights, heights[i][j], visited);
        
        return Astatus[i][j];
    }
    
    public boolean dfsP(int i, int j, int[][] heights, int prev, boolean[][] visited) {
        if (i >= heights.length || j >= heights[0].length || i < 0 || j < 0) {
            return false;
        }
        if (heights[i][j] > prev) {
            return false;
        }
        if (Pstatus[i][j]) {
            return true;
        }
        if (visited[i][j]) {
            return Pstatus[i][j];
        }
        visited[i][j] = true;
        if (i <= 0 || j <= 0) {
            Pstatus[i][j] = true;
            return true;
        }
        Pstatus[i][j] = dfsP(i - 1, j, heights, heights[i][j], visited) || dfsP(i, j + 1, heights, heights[i][j], visited) || dfsP(i + 1, j, heights, heights[i][j], visited) || dfsP(i, j - 1, heights, heights[i][j], visited);
        
        return Pstatus[i][j];
    }
    
    
    

}