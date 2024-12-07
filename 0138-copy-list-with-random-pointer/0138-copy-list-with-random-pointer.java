/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        // if (head == null) {
        //     return;
        // }
        Map<Node, Node> origin = new HashMap<>();
        
        Node cur = head;
        while (cur != null)  {
            origin.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        
        cur = head;
        Node out = origin.getOrDefault(head, null);
        while (cur != null) {
            out.next = origin.get(cur.next);
            out.random = origin.get(cur.random);
            cur = cur.next;
            out = out.next;
        }
    
    
        return origin.getOrDefault(head, null);
    }
}