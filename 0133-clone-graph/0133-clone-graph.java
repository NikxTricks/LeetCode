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
    Map<Node, Node> custom = new HashMap<>();
    public Node cloneGraph(Node node) {
        if (node == null) {
            return null;
        }
        return helper(node);
    }
    
    private Node helper(Node cur) {
        Node customCur = custom.getOrDefault(cur, null);
        if (customCur == null) {
            custom.put(cur, new Node(cur.val));
            customCur = custom.get(cur);
            for (int i = 0; i < cur.neighbors.size(); i++) {
                Node neighbor = cur.neighbors.get(i);
                Node customNeighbor = helper(neighbor);
                custom.put(neighbor, customNeighbor);
                customCur.neighbors.add(customNeighbor);
            }
        }
        
        return customCur;
        
    }

}