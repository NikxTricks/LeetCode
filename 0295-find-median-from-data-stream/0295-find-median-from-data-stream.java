class MedianFinder {
    PriorityQueue<Integer> l;
    PriorityQueue<Integer> r; 
    public MedianFinder() {
        l = new PriorityQueue<>(Collections.reverseOrder());
        r = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (l.isEmpty() && r.isEmpty()) {
            l.add(num);
        }
        else if (num > l.peek()) {
            r.add(num);
        }
        else {
            l.add(num);
        }
        if (r.size() - l.size() > 1) {
            l.add(r.remove());
        }
        else if (l.size() - r.size() > 1) {
            r.add(l.remove());
        }
    }
    
    public double findMedian() {
        if (l.size() == r.size()) {
           return ( (double) l.peek() + r.peek())/2; 
        }
        if (l.size() > r.size()) {
            return (double) l.peek();
        }

        return (double) r.peek();

        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */