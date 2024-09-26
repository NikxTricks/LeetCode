class Node {
    public int key;
    public int val;
    public Node next;
    public Node prev;
    
    public Node(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

class DoublyLinkedList {
    public Node head;
    public Node tail;
    public int size;
    private int count;
    
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        size = 0;
    }
    
    public void add(Node node) {
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            node.prev = node;
        }
        else {
            tail.next = node;
            node.prev = tail;
            tail = node;
            
            head.prev = tail;
            node.next = head;
        }
        size++;
    }
    
    public Node remove(Node node) {
        // System.out.printf("Removing for %d time\n", count);
        // count++;
        if (head.equals(tail)) {
            head = null;
            tail = null;
            return node;
        }
        
        if (tail.equals(node)) {
            tail = node.prev;
        }
        else if (head.equals(node)) {
            head = node.next;
        }
        
        node.prev.next = node.next;
        node.next.prev = node.prev;
        
        node.next = null;
        node.prev = null;
        
        size--;
        
        
        return node;
    }
}

class LRUCache {
    private int capacity;
    private DoublyLinkedList order;
    private Map<Integer, Node> data;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.order = new DoublyLinkedList();
        this.data = new HashMap<Integer, Node>();
    }
    
    public int get(int key) {
        Node cur = data.getOrDefault(key, null);
        if (cur != null) {
            //System.out.println(cur.val);
            order.add(order.remove(cur)); //add item back into LRU ordering if present
            return cur.val;
        }
        else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        Node cur = data.getOrDefault(key, null);
        if (cur != null) {
            cur.val = value;
            order.add(order.remove(cur));
        }
        else {
            if (order.size >= this.capacity) {
                data.remove(order.head.key);
                order.remove(order.head);
            }
            Node out = new Node(key, value);
            order.add(out); 
            data.put(key, out); //iffy
            //System.out.println(out.next == null);
            
        }
        
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */