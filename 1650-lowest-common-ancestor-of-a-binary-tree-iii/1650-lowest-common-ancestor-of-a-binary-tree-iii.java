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
            pn = (pn == null) ? p : pn.parent;
            qn = (qn == null) ? q : qn.parent;
        }
        
        return pn;
    }

}