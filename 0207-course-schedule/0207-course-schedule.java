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
        Queue<Integer> order = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (data[i] == 0) {
                order.add(i);
            }
        }
        while (order.size() > 0) {
                int cur = order.remove();
                    for (int neighbor: adj.get(cur)) {
                            data[neighbor]--;
                            if (data[neighbor] == 0) {
                               order.add(neighbor); 
                            }
                        }
                    
                    numCourses--;
        }
        if (numCourses != 0) {
            return false;
        }
        return true;
    
    }
    
}