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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        helper(root, 0);
        return sum;
    }
    
    
    private void helper(TreeNode cur, int curSum) {
        if (cur == null) {
            return;
        }
        int newSum = (curSum * 10) + cur.val;
        if (cur.left == null && cur.right == null) {
            sum += newSum;
        }
        else {
            helper(cur.left, newSum);
            helper(cur.right, newSum);
        }
    }
}