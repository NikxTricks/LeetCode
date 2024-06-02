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
        helper(root, p.val, q.val, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return out;
    }
    
    public boolean helper(TreeNode cur, int a, int b, int min, int max) {
        if (cur == null) {
            return false;
        }
        boolean left = false;
        boolean right = false;
        if (a > min || b > min) {
            left = helper(cur.left, a, b, Integer.MIN_VALUE, cur.val);
        }
        if (a < max || b < max) {
            right = helper(cur.right, a, b, cur.val, Integer.MAX_VALUE);
        }
        if (set) {
            return false;
        }
        if (left && right) {
            set = true;
            out = cur;
            return true;
        }
        if (cur.val == a || cur.val == b) {
            if ((left || right)) {
                set = true;
                out = cur;  
            }
            return true;
        }
        
        return left || right;
    }
}