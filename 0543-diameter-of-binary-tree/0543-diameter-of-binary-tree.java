class Solution {
    int maxDist = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxDist;
    }
    
    
    private int helper(TreeNode cur) {
        if (cur == null) {
            return -1;
        }
        int l = helper(cur.left) + 1;
        int r = helper(cur.right) + 1;
        maxDist = Math.max(maxDist, l + r);
        
        return Math.max(l, r);
    }

}
