class Solution {
    int maxDiameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxDiameter;
    }

    public int helper(TreeNode cur) {
        if (cur == null) {
            return 0;
        }
        int left = helper(cur.left);
        int right = helper(cur.right);
        // Update the maximum diameter found so far
        maxDiameter = Math.max(maxDiameter, left + right);
        return Math.max(left, right) + 1;
    }
}
