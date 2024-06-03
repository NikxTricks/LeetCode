class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != n - 1) {
           return false; 
        }
        if (edges.length == 0) {
            return true;
        }
        int[] sets = new int[n];
        Arrays.fill(sets, -1);
        for (int[] edge: edges) {
            System.out.println(edge[0] + ", " + edge[1]);
            if (sets[edge[0]] != -1 && sets[edge[1]] != -1 && sets[edge[0]] == sets[edge[1]]) {
                return false;
            }
            else if (sets[edge[0]] != -1) {
                merge(edge[1], sets, sets[edge[0]]);
            }
            else if (sets[edge[1]] != -1) {
                merge(edge[0], sets, sets[edge[1]]);
            }
            else {
                sets[edge[0]] = edge[0];
                sets[edge[1]] = edge[0];
            }
        }
        
        return true;
        
    }
    
    public void merge(int vertex, int[] sets, int parent) {
        if (sets[vertex] == -1) {
            sets[vertex] = parent;
           return; 
        }
        if (sets[vertex] != vertex) {
            merge(sets[vertex], sets, parent);
        }
        sets[vertex] = parent;

    }
    
    /*
    7
[[0,1],[2,3],[1,3],[0,2],[4,5],[5,6]]
    */
    
}