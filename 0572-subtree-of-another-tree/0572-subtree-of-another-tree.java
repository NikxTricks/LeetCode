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
    boolean result = false;
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
        find(root, subRoot);
        return result;
        
    }
    
    public void find(TreeNode cur, TreeNode subroot) {
        if (cur == null) {
            return;
        }
        if (cur.val == subroot.val) {
            result = result || helper(cur, subroot);
        }
        find(cur.left, subroot);
        find(cur.right, subroot);
    }
    
    public boolean helper(TreeNode cur1, TreeNode cur2) {
        if (cur1 == null && cur2 == null) {
            return true;
        }
        if (cur1 == null || cur2 == null) {
            return false;
        }
        if (cur1.val == cur2.val) {
            return helper(cur1.right, cur2.right) && helper(cur1.left, cur2.left);
        }
        return false;
    }
}