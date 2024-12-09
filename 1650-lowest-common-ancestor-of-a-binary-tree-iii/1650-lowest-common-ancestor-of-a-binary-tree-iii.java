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
        Node pp = p;
        Node qq = q;
        
        while (pp != qq) {
            pp = (pp.parent == null) ? q : pp.parent;
            qq = (qq.parent == null) ? p : qq.parent;
        }
        
        return pp;
    }

}