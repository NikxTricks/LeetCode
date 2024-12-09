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
    public int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    
    private int helper(TreeNode cur, int sum) {
        if (cur == null) {
            return 0;
        }
        int curSum = sum * 10 + cur.val;
        int l = helper(cur.left, curSum);
        int r = helper(cur.right, curSum);
        
        if (l == 0 && r == 0) {
           // System.out.println(curSum);
            return curSum;
        }
        
        return l + r;
    }

}