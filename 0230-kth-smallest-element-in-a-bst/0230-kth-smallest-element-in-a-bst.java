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
        LinkedList<Integer> out = new LinkedList<>();
        kHelper(root, out, k);
        return out.get(out.size() - 1);
        //return min.poll();
    }
    
   public List<Integer> kHelper(TreeNode cur, List<Integer> out, int max) {
        if (cur == null) {
            return out;
        }
        kHelper(cur.left, out, max);
        if (out.size() == max) {
            return out;
        } 
        out.add(out.size(), cur.val);
        kHelper(cur.right, out, max);

        return out;

    }
}