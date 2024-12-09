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
            head = new Node(insertVal);
            head.next = head;
            return head;
        }
        
        Node prev = head;
        Node next = head.next;
        boolean insert = false;
        
        while (true) {
            if (insertVal >= prev.val && insertVal <= next.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                //System.out.println("Here1");
                break;
            }
            else if (prev.val > next.val && insertVal >= prev.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                //System.out.println("Here2");
                break;
            }
            else if (prev.val > next.val && insertVal <= next.val) {
                prev.next = new Node(insertVal);
                prev.next.next = next;
                insert = true;
                //System.out.println("Here3");
                break;
            }
            prev = prev.next;
            next = next.next;
            if (prev == head) {
                break;
            }
        }
        
        if (!insert) {
            Node temp = head.next;
            head.next = new Node(insertVal);
            head.next.next = temp;
        }
        
        return head;
    }
}