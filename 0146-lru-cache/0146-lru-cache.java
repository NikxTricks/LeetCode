class LRUCache {
    private int capacity;
    private List<Integer> order;
    private Map<Integer, Integer> data;
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.order = new ArrayList<Integer>();
        this.data = new HashMap<Integer, Integer>();
        //Arrays.fill(data, -1);
    }
    
    public int get(int key) {
        int out = data.getOrDefault(key, -1);
        if (out != -1) {
            order.add(removeItem(key)); //add item back into LRU ordering if present
        }
        return out;
    }
    
    public void put(int key, int value) {
        if (data.containsKey(key)) {
            data.put(key, value);
            order.add(removeItem(key));
        }
        else {
            if (order.size() >= this.capacity) {
                data.remove(order.remove(0));
            }
            data.put(key, value);
            order.add(key); 
        }
        
    }
    
    public int removeItem(int item) {
        int i = 0;
        while (this.order.get(i) != item) {
            i++;
        }
        return this.order.remove(i);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */