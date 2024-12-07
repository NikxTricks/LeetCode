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
        helper(root);
        
        if (head == null) {
           return null;
        }
        
        head.left = tail;
        tail.right = head;
        
        
        return head;
    }
    
    
    private void helper(Node cur) {
        if (cur == null) {
            return;
        }
        //System.out.println(cur.val);
        
        helper(cur.left);
        
        if (head == null) {
            head = cur;
            tail = cur;
        }
        else {
            tail.right = cur;
            tail.right.left = tail;
            tail = tail.right;
        }
        
        helper(cur.right);  
    }
}