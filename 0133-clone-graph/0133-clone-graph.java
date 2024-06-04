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
        return helper(node, data);
    }
    
    public Node helper(Node cur, HashMap<Integer, Node> data) {
        if (data.containsKey(cur.val)) {
            return data.get(cur.val);
        }
        Node out = new Node(cur.val);
        data.put(cur.val, out);
        for (Node neighbor: cur.neighbors) {
            out.neighbors.add(helper(neighbor, data));
        }
        
        return out;
    }
}