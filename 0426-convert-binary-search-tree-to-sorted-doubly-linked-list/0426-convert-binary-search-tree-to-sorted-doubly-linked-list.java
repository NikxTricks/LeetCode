/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val,Node _left,Node _right) {
        val = _val;
        left = _left;
        right = _right;
    }
};
*/

class Solution {
    Node head;
    Node tail;
    
    public Node treeToDoublyList(Node root) {
        if (root == null) {
            return null;
        }
        helper(root);
        
        head.left = tail;
        tail.right = head;
        
        return head;
    }
    
    
    private void helper(Node cur) {
        if (cur == null) {
            return;
        }
        
        helper(cur.left);
        
        if (head == null) {
            head = cur;
            tail = cur;
        }
        else {
            tail.right = cur;
            cur.left = tail;
            tail = tail.right;
        }
        

        
        helper(cur.right);
    }
}