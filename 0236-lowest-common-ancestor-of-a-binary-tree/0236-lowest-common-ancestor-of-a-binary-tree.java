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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return helper(root, p.val, q.val);
    }
    
    public TreeNode helper(TreeNode cur, int p, int q) {
        if (cur == null) {
            return null;
        }
        if (cur.val == p || cur.val == q) {
           return cur; 
        }
        TreeNode l = helper(cur.left, p, q);
        TreeNode r = helper(cur.right, p, q);
        if (l != null && r != null) {
            return cur;
        }
        if (l != null) {
            return l;
        }
        
        return r;
    }
}