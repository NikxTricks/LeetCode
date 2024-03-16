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
    public List<Integer> rightSideView(TreeNode root) {
        Queue<TreeNode> order = new LinkedList<>();
        List<Integer> out = new LinkedList<>();
        if (root == null) {
            return out;
        }
        
        order.add(root);
        
        while (!order.isEmpty()) {
            int size = order.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = order.remove();
                if (i == size - 1) {
                    out.add(cur.val);
                }
                if (cur.left != null) {
                    order.add(cur.left);
                }
                if (cur.right != null) {
                    order.add(cur.right);
                }
            }
        }
        
        
        return out;
    }
}