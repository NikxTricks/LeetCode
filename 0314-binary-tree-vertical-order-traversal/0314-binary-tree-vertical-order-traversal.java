/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> out = new ArrayList<>(); 
        if (root == null) {
            return out;
        }
        
        
        Map<Integer, List<Integer>> cols = new HashMap<>();
        Queue<Pair> order = new LinkedList<>();
        order.add(new Pair(root, 0));
        
        while (!order.isEmpty()) {
            Pair curPair = order.remove();
            TreeNode cur = curPair.node;
            int curCol = curPair.col;
            max = Math.max(max, curCol);
            min = Math.min(min, curCol);

            if (!cols.containsKey(curCol)) {
                cols.put(curCol, new ArrayList<>());
            }

            cols.get(curCol).add(cur.val);
            
            if (cur.left != null) {
                order.add(new Pair(cur.left, curCol - 1));
            }
            
            if (cur.right != null) {
                order.add(new Pair(cur.right, curCol + 1));
            }
            
        }
        
        
        for (int i = min; i <= max; i++) {
            out.add(cols.get(i));
        }
        
        return out;
    }
    
}

class Pair {
    TreeNode node;
    int col;
    
    public Pair(TreeNode node, int col) {
        this.node = node;
        this.col = col;
    }
}