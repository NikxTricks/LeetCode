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
    public Node lowestCommonAncestor(Node p, Node q) {
        Node pn = p;
        Node qn = q;
        while (p.val != q.val) {
            p = (p.parent == null) ? pn : p.parent;
            q = (q.parent == null) ? qn : q.parent;
        }
        
        return p;
    }

}