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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();
        List<List<Integer>> out = new LinkedList<>();
        if (root == null) {
            return out;
        }

        s1.add(root);
        
        while (!s1.isEmpty() || !s2.isEmpty()) {
            List<Integer> subOut = new LinkedList<>();
            while (!s1.isEmpty()) {
                if (s1.peek().left != null) {
                    s2.add(s1.peek().left);
                }
                if (s1.peek().right != null) {
                    s2.add(s1.peek().right);
                }
                subOut.add(s1.pop().val);
            }
            if (!subOut.isEmpty()) {
                out.add(subOut);
            }
            List<Integer> subOutN = new LinkedList<>();
            while (!s2.isEmpty()) {
                if (s2.peek().right != null) {
                    s1.add(s2.peek().right);
                }
                if (s2.peek().left != null) {
                    s1.add(s2.peek().left);
                }
                subOutN.add(s2.pop().val);
            }
            if (!subOutN.isEmpty()) {
                out.add(subOutN);
            }
        }

        return out;
    }
}