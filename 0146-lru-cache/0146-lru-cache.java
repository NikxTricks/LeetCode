class Node {
  int key;
  int val;
  
  Node prev;
  Node next;
  
  public Node(int key, int val) {
    this.key = key;
    this.val = val;
    this.prev = null;
    this.next = null;
  }
}

class DoublyLinkedList {
  //front represents LRU
  Node head;
  Node tail;
  
  int size;
  
  public DoublyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }
  
  public void add(Node cur) {
    if (head == null) {
      this.head = cur;
      this.tail = cur;
    }
    else {
      this.tail.next = cur;
      cur.prev = tail;
      this.tail = cur;
    }
    this.size++;
  }
  
  public Node remove(Node cur) {
    if (this.size == 1) {
      this.head = null;
      this.tail = null;
    }
    else if (this.head == cur) {
      this.head = this.head.next;
      this.head.prev.next = null;
      this.head.prev = null;
    }
    else if (this.tail == cur) {
      this.tail = this.tail.prev;
      this.tail.next.prev = null;
      this.tail.next = null;
    }
    else { //suboptimal for singly linkedlist
      cur.prev.next = cur.next;
      cur.next.prev = cur.prev;
      cur.prev = null;
      cur.next = null;
    }
    this.size--;
    return cur;
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
            
        }
        
    }
    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */