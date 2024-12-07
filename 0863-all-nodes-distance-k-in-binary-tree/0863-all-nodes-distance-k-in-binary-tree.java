/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> out = new ArrayList<>();
        Map<TreeNode, TreeNode> parents = new HashMap<>();
        Queue<TreeNode> order = new LinkedList<>();
        Set<TreeNode> visited = new HashSet<>();
        
        order.add(root);
        
        while (!order.isEmpty()) {
            int size = order.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = order.remove();
                //System.out.println(cur.val);
                if (cur.left != null) {
                    parents.put(cur.left, cur);
                    order.add(cur.left);
                }
                if (cur.right != null) {
                    parents.put(cur.right, cur);
                    order.add(cur.right);
                }
            }
        }
        
        order.add(target);
        visited.add(target);
        int count = 0;
    
        while (!order.isEmpty()) {
            int size = order.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = order.remove();
                if (count == k) {
                    out.add(cur.val);
                }
                if (count > k) {
                    break;
                }
                if (cur.left != null && !visited.contains(cur.left)) {
                    order.add(cur.left);
                    visited.add(cur.left);
                }
                if (cur.right != null && !visited.contains(cur.right)) {
                    order.add(cur.right);
                    visited.add(cur.right);
                }
                TreeNode parent = parents.getOrDefault(cur, null);
                if (parent != null && !visited.contains(parent)) {
                    order.add(parent);
                    visited.add(parent);
                }
    
            }
            count++;
        }
        
        
        
        return out;
    }
    
}