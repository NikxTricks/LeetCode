/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Queue<Node> bfs = new LinkedList<>();
        if (root == null) {
           return null; 
        }
        bfs.add(root);
        
        while (!bfs.isEmpty()) {
            int size = bfs.size();
            for (int i = 0; i < size; i++) {
                Node cur = bfs.remove();
                if (i < size - 1) {
                    cur.next = bfs.peek();
                }
                else {
                    cur.next = null;
                }
                if (cur.left != null) {
                    bfs.add(cur.left);
                }
                if (cur.right != null) {
                    bfs.add(cur.right);
                }
            }
        }
        
        return root;
    }
}