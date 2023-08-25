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
    private int min = 0;
    private int count = 0;
    
    
    public int kthSmallest(TreeNode root, int k) {
        kHelper(root, k);
        return min;
    }
    
   public void kHelper(TreeNode cur, int k) {
        if (cur == null) {
            return;
        }
       
        kHelper(cur.left, k);
        count++;
        if (count == k) {
            min = cur.val;
            return;
        } 
       if (count > k) {
           return;
       }
       
        kHelper(cur.right, k);


    }
}