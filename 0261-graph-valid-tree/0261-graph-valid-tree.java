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
            int parent = edge[0];
            if (sets.containsKey(edge[0]) && sets.containsKey(edge[1])) {
               // System.out.println(edge[0] + ": Parent is " + sets.get(edge[0]));
                //System.out.println(edge[1] + ": Parent is " + sets.get(edge[1]));
                if (sets.get(edge[0]) == sets.get(edge[1])) {
                    return false;
                }
            }
            else if (sets.containsKey(edge[0])) {
                parent = sets.get(edge[0]);
                sets.put(edge[1], parent);
            }
            else if (sets.containsKey(edge[1])) {
                parent = sets.get(edge[1]);
                sets.put(edge[0], parent);
            }
            else {
                sets.put(edge[0], parent);
                sets.put(edge[1], parent);
            }
        }
        if (sets.size() != n) {
            return false;
        }
        
        return true;
        
    }
    
}