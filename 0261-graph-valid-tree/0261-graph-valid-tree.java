class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
           return false; 
        }
        if (edges.length == 0) {
            return true;
        }
        //HashMap<Integer, Integer> sets = new HashMap<>();
        int[] sets = new int[n];
        Arrays.fill(sets, -1);
        for (int[] edge: edges) {
            if (sets[edge[0]] != -1 && sets[edge[1]] != -1 && sets[edge[0]] == sets[edge[1]]) {
                //System.out.println(edge[0]"Here");
                return false;
            }
            else if (sets[edge[0]] != -1) {
                sets[edge[1]] = sets[edge[0]];
            }
            else if (sets[edge[1]] != -1) {
                sets[edge[0]] = sets[edge[1]];
            }
            else {
                sets[edge[0]] = edge[0];
                sets[edge[1]] = edge[0];
            }
        }
        

        
        return true;
        
    }
    
}