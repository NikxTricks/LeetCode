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
        return helper(root, 0);
        //return sum;
    }
    
    
    private int helper(TreeNode cur, int curSum) {
        if (cur == null) {
            return 0;
        }
        int newSum = (curSum * 10) + cur.val;
        if (cur.left == null && cur.right == null) {
            return newSum;
        }
        return helper(cur.left, newSum) + helper(cur.right, newSum);
    }
}