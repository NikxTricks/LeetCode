/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode lca = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        helper(root, p.val, q.val);
        return lca;
    }
    
    
    public boolean helper(TreeNode cur, int p, int q) {
        if (cur == null) {
            return false;
        }
        
        boolean left = helper(cur.left, p, q);
        boolean right = helper(cur.right, p, q);
        if ((left && right) || (cur.val == p || cur.val == q) && (left || right) && lca == null) {
            lca = cur;
        }
        
        return cur.val == p || cur.val == q || left || right;
    }
    

}