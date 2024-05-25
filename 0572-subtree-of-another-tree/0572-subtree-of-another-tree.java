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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return findRoot(root, subRoot, subRoot);
        //return out;
        
        
    }
    
    public boolean findRoot(TreeNode root, TreeNode subRoot, TreeNode origin) {
        if (root == null && subRoot == null) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        if (root.val == subRoot.val) {
            if (findRoot(root.left, subRoot.left, origin) && findRoot(root.right, subRoot.right, origin)) {
                return true;
            }

        }
        if (subRoot != origin) {
            return false;
        }
            return findRoot(root.left, subRoot, origin) || findRoot(root.right, subRoot, origin);

    }
    /*
    public boolean checkSubtree(TreeNode root, TreeNode subroot) {
        return true;
    }
    */
    
}