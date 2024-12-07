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
        double dist = Math.abs(target - root.val);
        
        
        TreeNode cur = root;
        while (cur != null) {
            double curdist = Math.abs(target - cur.val);
            if (curdist < dist || (curdist == dist && cur.val < closest)) {
                closest = cur.val;
                dist = curdist;
            }
            
            if (cur.val > target) {
                cur = cur.left;
            }
            else if (cur.val < target) {
                cur = cur.right;
            }
            else {
                break;
            }
        }
        
        return closest;
        
    }
    
}