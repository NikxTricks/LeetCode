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
    TreeNode out;
    boolean set = false;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        out = root;
        helper(root, Math.max(p.val, q.val), Math.min(p.val, q.val));
        return out;
    }
    
    public boolean helper(TreeNode cur, int a, int b) {
        if (cur == null || set) {
            return false;
        }
        boolean left = helper(cur.left, a, b);
        boolean right = helper(cur.right, a, b);
        if (left && right && !set) {
            set = true;
            out = cur;
            return true;
        }
        if (cur.val == a || cur.val == b) {
            if ((left || right) && !set) {
                set = true;
                out = cur;  
            }
            return true;
        }
        
        return left || right;
    }
}