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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> out = new LinkedList<>();
        Queue<TreeNode> order = new LinkedList<>();
        order.add(root);
        while (!order.isEmpty()) {
            int size = order.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode cur = order.remove();
                if (cur == null) {
                    continue;
                }
                level.add(cur.val);
                order.add(cur.left);
                order.add(cur.right);
            }
            if (!level.isEmpty()) {
                 out.add(level);
            }
        }
        
        return out;
    }
    
}