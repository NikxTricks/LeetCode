/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _next) {
        val = _val;
        next = _next;
    }
};
*/

class Solution {
    public Node insert(Node head, int insertVal) {
        if (head == null) {
            Node out = new Node(insertVal);
            out.next = out;
            return out;
        }
        
        Node prev = head;
        Node next = head.next;
        
        boolean insert = false;
        while (true) {
            if (prev.val <= insertVal && insertVal <= next.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                break;
            }
            if (prev.val > next.val && insertVal >= prev.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                break;
            }
            if (prev.val > next.val && insertVal <= next.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                break;
            }
            prev = prev.next;
            next = next.next;
            if (prev == head) {
                break;
            }
        }
        
        if (!insert) {
            Node out = new Node(insertVal);
            Node temp = head.next;
            head.next = out;
            out.next = temp;
        }
        
        return head;
        
    }
}