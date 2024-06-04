/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        HashMap<Integer, Node> data = new HashMap<>(); 
        Node root = new Node(node.val);
        data.put(node.val, root);
        helper(root, node, data);
        return root;
    }
    
    public void helper(Node cur, Node original, HashMap<Integer, Node> data) {
        for (Node neighbor: original.neighbors) {
            Node myNeighbor = data.getOrDefault(neighbor.val, null);
            if (myNeighbor == null) {
                myNeighbor = new Node(neighbor.val);
                data.put(neighbor.val, myNeighbor);
                helper(myNeighbor, neighbor, data);
            }
                cur.neighbors.add(myNeighbor);
        }
    }
}