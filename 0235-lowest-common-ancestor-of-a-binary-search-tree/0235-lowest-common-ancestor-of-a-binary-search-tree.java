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
    
    public TreeNode helper(TreeNode cur, int a, int b) {
        if (a > cur.val && b > cur.val) {
            return helper(cur.right, a, b);
        }
        if (a < cur.val && b < cur.val) {
            return helper(cur.left, a, b);
        }
        return cur;
        
    }
}