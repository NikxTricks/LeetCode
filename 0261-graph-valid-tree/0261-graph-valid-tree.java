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
            int parent = Math.min(edge[0], edge[1]);
            if (sets.containsKey(edge[0]) && sets.containsKey(edge[1])) {
                if (unionFind(edge[0], sets) == unionFind(edge[1], sets)) {
                    return false;
                }
            }
            else if (sets.containsKey(edge[0])) {
                parent = unionFind(edge[0], sets);
            }
            else if (sets.containsKey(edge[1])) {
                parent = unionFind(edge[1], sets);
            }
            sets.put(edge[0], parent);
            sets.put(edge[1], parent);
        }
        if (sets.size() != n) {
            return false;
        }
        
        return true;
        
    }
    
    public int unionFind(int vertex, HashMap<Integer, Integer> sets) {
        int out = sets.getOrDefault(vertex, -1);
        if (out != -1 && out != vertex) {
            return unionFind(sets.get(vertex), sets);
        }
        
        return out;
    }
}