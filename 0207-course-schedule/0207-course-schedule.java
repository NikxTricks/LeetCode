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
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (data[i] == 0) {
                dfs(i, adj, data, visited);
            }
        }
        return visited.size() == numCourses;
    
    }
    
    public void dfs(int cur, List<List<Integer>> adj, int[] data, HashSet<Integer> visited) {
        if (visited.contains(cur)) {
            return;
        }
        visited.add(cur);
        for (int neighbor: adj.get(cur)) {
            data[neighbor]--;
            if (data[neighbor] == 0) {
                dfs(neighbor, adj, data, visited); 
            }
        }
        
    }
    
    
}