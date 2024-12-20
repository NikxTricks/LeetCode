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
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> bfs = new LinkedList<>();
        bfs.add(root);
        
        boolean e = false;
        while (!bfs.isEmpty()) {
            TreeNode cur = bfs.remove();
            if (cur != null) {
                if (e) {
                    return false;
                }
                bfs.add(cur.left);
                bfs.add(cur.right);
            }
            else {
                e = true;
            }
        }
        
        return true;
    }
}