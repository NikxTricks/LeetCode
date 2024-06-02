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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> out = new ArrayList<>();
        helper(root, out);
        return out;
    }
    
    public void helper(TreeNode cur, List<Integer> out) {
        if (cur == null) {
            return;
        }
        out.add(cur.val);
        helper(cur.left, out);
        helper(cur.right, out);
    }
}