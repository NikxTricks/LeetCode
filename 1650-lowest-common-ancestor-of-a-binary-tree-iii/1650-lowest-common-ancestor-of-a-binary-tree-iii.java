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
        while (pn != qn) {
            pn = (pn == null) ? q : pn.parent;
            qn = (qn == null) ? p : qn.parent;
        }
        
        return pn;
    }

}