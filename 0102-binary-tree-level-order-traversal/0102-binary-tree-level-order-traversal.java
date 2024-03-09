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
//next is BFS appraoch, using a Queue to line up nodes
//DFS approach
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> f = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> out = new LinkedList<>();
        
        if (root == null) {
            return out;
        }
        
        f.add(root);
        
        TreeNode cur = null;
        while (f.size() != 0 || q.size() != 0) {
            if (f.size() != 0) {
               out.add(new LinkedList<Integer>()); 
            }
            while (f.size() != 0) {
                cur = f.remove();
                
                out.get(out.size() - 1).add(cur.val);
                if (cur.left != null) {
                    q.add(cur.left);
                }
                if (cur.right != null) {
                    q.add(cur.right);
                }
            }
            if (q.size() != 0) {
               out.add(new LinkedList<Integer>()); 
            }
            while (q.size() != 0) {
                cur = q.remove();
                out.get(out.size() - 1).add(cur.val);
                if (cur.left != null) {
                    f.add(cur.left);
                }
                if (cur.right != null) {
                    f.add(cur.right);
                } 
            }
        }
        
        return out;
    }
    
}