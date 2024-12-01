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
        helper(p, q);
        return lca;
    }
    
    
    public void helper(Node a, Node b) {
        Node an = null;
        Node bn = null;
        if (a == null && b == null) {
            return;
        }
        if (a != null) {
            if (visited.contains(a.val)) {
                lca = a;
                return;
            }
            visited.add(a.val);
            an = a.parent;
        }
        if (b != null) {
            if (visited.contains(b.val)) {
                lca = b;
                return;
            }
            visited.add(b.val);
            bn = b.parent;
        }
        
        helper(an, bn);
    }
}