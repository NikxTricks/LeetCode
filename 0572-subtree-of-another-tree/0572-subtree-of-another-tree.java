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
    //boolean out = false;
    TreeNode origin = null;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        this.origin = subRoot;
        return findRoot(root, subRoot);

    }
    
    public boolean findRoot(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (findRoot(root.left, subRoot.left) && findRoot(root.right, subRoot.right)) {
                return true;
            }
        }
        
        if (subRoot != this.origin) {
            return false;
        }
            
        return findRoot(root.left, subRoot) || findRoot(root.right, subRoot);

    }

    
}