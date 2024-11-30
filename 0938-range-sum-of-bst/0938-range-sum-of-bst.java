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
    public int rangeSumBST(TreeNode root, int low, int high) {
        return helper(root, low, high);
    }
    
    
    
    public int helper(TreeNode cur, int low, int high) {
        if (cur == null) {
            return 0;
        }
        if (cur.val >= low && cur.val <= high) {
            return cur.val + helper(cur.left, low, high) + helper(cur.right, low, high);
        }
        else if (cur.val < low) {
            return helper(cur.right, low, high);
        }
        else {
            return helper(cur.left, low, high);
        }
        
    }
    
    
    
}