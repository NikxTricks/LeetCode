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
        while (p != q) {
            p = (p == null) ? pn : p.parent;
            q = (q == null) ? qn : q.parent;
        }
        
        return p;
    }

}