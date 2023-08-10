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
    public TreeNode invertTree(TreeNode root) {
        return helper(root);
    }
    
    public TreeNode helper(TreeNode cur) {
        if (cur == null) {
           return null; 
        }
        TreeNode temp = helper(cur.left);
        cur.left = helper(cur.right);
        cur.right = temp;
        return cur;
    }
}