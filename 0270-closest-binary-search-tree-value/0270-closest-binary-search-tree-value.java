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
    public int closestValue(TreeNode root, double target) {
        int closest = root.val;
        TreeNode cur = root;
        while (cur != null) {
            if (Math.abs(target - cur.val) <= Math.abs(target - closest)) {
                if (Math.abs(target - cur.val) < Math.abs(target - closest)) {
                    closest = cur.val;
                }
                else if (cur.val < closest) {
                    closest = cur.val;
                }
            }
            if (cur.val > target) {
                cur = cur.left;
            }
            else if (cur.val < target) {
                cur = cur.right;
            }
            else {
                return cur.val;
            }
        }
        
        return closest;
    }
    
}