class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] data = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge: prerequisites) {
            data[edge[1]]++;
            adj.get(edge[0]).add(edge[1]);
        }
        for (int i = 0; i < numCourses; i++) {
            if (data[i] == 0) {
                dfs(i, adj, data);
            }
        }
        for (int inDegree: data) {
           if (inDegree > 0) {
               return false;
           } 
        }
        
        return true;
    
    }
    
    public void dfs(int cur, List<List<Integer>> adj, int[] data) {
        for (int neighbor: adj.get(cur)) {
            data[neighbor]--;
            if (data[neighbor] == 0) {
                dfs(neighbor, adj, data); 
            }
        }
        
    }
    
    
}