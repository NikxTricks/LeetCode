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
        
        Queue<TreeNode> f = new LinkedList<>();
        List<List<Integer>> out = new LinkedList<>();

        if (root == null) {
            return out;
        }
        f.add(root);
        
        TreeNode cur = null;
        while (f.size() != 0) {
            int levelSize = f.size();
            List<Integer> subOut = new LinkedList<>();
            for (int i = 0; i < levelSize; i++) {
                cur = f.remove();
                subOut.add(cur.val);
                if (cur.left != null) {
                    f.add(cur.left);
                }
                if (cur.right != null) {
                    f.add(cur.right);
                }
            }
            out.add(subOut);
        }
        return out;
    }
    
}