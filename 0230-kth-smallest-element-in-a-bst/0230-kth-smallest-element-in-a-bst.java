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
    public int k; //number traversed
    public int min; //return
    
    public int kthSmallest(TreeNode root, int k) {
        helper(root, k);
        return this.min;
    }
    
    public void helper(TreeNode cur, int k) {
        if (cur == null) {
            return;
        }
        helper(cur.left, k);
        this.k++;
        if (this.k == k) {
                this.min = cur.val;
        }
        helper(cur.right, k);
    }

}