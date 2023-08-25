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
        PriorityQueue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
        helper(root, min, k);
        return min.poll();
    }
    
    public void helper(TreeNode cur, PriorityQueue<Integer> min, int k) {
        if (cur == null) {
            return;
        }
        
        min.add(cur.val);
        if (min.size() > k) {
            min.remove();
        }
        helper(cur.left, min, k);
        helper(cur.right, min, k);
    }
}