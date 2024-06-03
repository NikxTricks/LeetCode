class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
           return false; 
        }
        if (edges.length == 0) {
            return true;
        }
        HashMap<Integer, Integer> sets = new HashMap<>();
        for (int[] edge: edges) {
            if (sets.containsKey(edge[0]) && sets.containsKey(edge[1]) && sets.get(edge[0]) == sets.get(edge[1])) {
                return false;
            }
            else if (sets.containsKey(edge[0])) {
                sets.put(edge[1], sets.get(edge[0]));
            }
            else if (sets.containsKey(edge[1])) {
                sets.put(edge[0], sets.get(edge[1]));
            }
            else {
                sets.put(edge[0], edge[0]);
                sets.put(edge[1], edge[0]);
            }
        }
        if (sets.size() != n) {
            return false;
        }
        
        return true;
        
    }
    
}