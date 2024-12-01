/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node parent;
};
*/

class Solution {
    Set<Integer> visited = new HashSet<>();
    Node lca = null;
    public Node lowestCommonAncestor(Node p, Node q) {
        helper(p);
        helper(q);
        return lca;
    }
    
    
    public void helper(Node cur) {
        if (cur == null) {
            return;
        }
        
        if (visited.contains(cur.val)) {
            lca = cur;
        }
        else {
            visited.add(cur.val);
            helper(cur.parent);
        }
    }
}