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
        Queue<TreeNode> q = new LinkedList<>();
        Stack<TreeNode> s = new Stack<>();
        List<List<Integer>> out = new LinkedList<>();
        if (root == null) {
            return out;
        }

        q.add(root);
        boolean zig = true;
        while (q.size() != 0) {
            int levelSize = q.size();
            List<Integer> subOut = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                if (q.peek().left != null) {
                    q.add(q.peek().left);
                    if (zig) {
                       s.add(q.peek().left); 
                    }
                }
                if (q.peek().right != null) {
                    q.add(q.peek().right);
                    if (zig) {
                        s.add(q.peek().right);
                    }
                }  
                if (zig) {
                    subOut.add(q.remove().val);
                }
                else {
                    subOut.add(s.pop().val);
                    q.remove();
                }
            }
            out.add(subOut);
            zig = !zig;
        }
        return out;
    }
}