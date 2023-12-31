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
    public int maxDepth(TreeNode root) {
       return traverse(root);
        
    }
    
    public int traverse(TreeNode curr) {
        if (curr == null) {
            return 0;
        }
        
        return max(traverse(curr.left), traverse(curr.right)) + 1;
    }
    
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        
        return b;
    }
}