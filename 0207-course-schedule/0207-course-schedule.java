class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] data = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge: prerequisites) {
            //System.out.println("Here");
            data[edge[1]]++;
            adj.get(edge[0]).add(edge[1]);
        }
        HashSet<Integer> visited = new HashSet<>();
        for (int i = 0; i < numCourses; i++) {
            if (data[i] == 0) {
                //System.out.println(i + ": " + data[i]);
                dfs(i, adj, data, visited);
            }
        }
        return visited.size() == numCourses;
    
    }
    
    public void dfs(int cur, List<List<Integer>> adj, int[] data, HashSet<Integer> visited) {
        //System.out.println(cur);
        if (visited.contains(cur)) {
            return;
        }
        //System.out.println(cur);
        visited.add(cur);
        for (int neighbor: adj.get(cur)) {
            data[neighbor]--;
            if (data[neighbor] == 0) {
                dfs(neighbor, adj, data, visited); 
            }
        }
        
    }
    
    
}