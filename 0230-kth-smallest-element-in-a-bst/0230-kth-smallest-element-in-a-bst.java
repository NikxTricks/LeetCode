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
    public int kthSmallest(TreeNode root, int k) {
        int min = root.val;
        int count = 0;
        Stack<TreeNode> order = new Stack<>();
        TreeNode cur = root;
        while (cur != null) {
            order.add(cur);
            cur = cur.left;
        }
        while (order.size() != 0) {
            cur = order.pop();
            if (++count == k) {
                min = cur.val;
                return min;
            }
            cur = cur.right;
            while (cur != null) {
                order.add(cur);
                cur = cur.left;
            }
        }
        return min;
        
    }


}