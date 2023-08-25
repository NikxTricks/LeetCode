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
        int count = 0;
        List<List<Integer>> out = new LinkedList<>();
        helper(root, out, count);
        return out;
        
    }
    
    public void helper(TreeNode cur, List<List<Integer>> out, int count) {
        if (cur == null) {
            return;
        }
        if (count == out.size()) {
            out.add(new LinkedList<Integer>(Arrays.asList(cur.val)));
        }
        else {
            out.get(count).add(cur.val);
        }
        helper(cur.left, out, ++count);
        helper(cur.right, out, count);
    }
}