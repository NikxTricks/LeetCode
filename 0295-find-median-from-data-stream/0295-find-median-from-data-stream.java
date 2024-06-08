class MedianFinder {
    PriorityQueue<Integer> l;
    PriorityQueue<Integer> r; 
    public MedianFinder() {
        l = new PriorityQueue<>(Collections.reverseOrder());
        r = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        if (l.isEmpty()) {
            l.add(num);
        }
        else if (num > l.peek()) {
            r.add(num);
        }
        else {
            l.add(num);
        }
        if (r.size() - l.size() >= 1) {
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
        return (double) l.peek();


        
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */

/*
class MedianFinder {
    
    //Optimized for nums 0-100
    int[] count;
    double totalCount;
    int left;
    int right;
    int curSum;
    
    public MedianFinder() {
        count = new int[101];
        totalCount = 0;
        left = -1;
        right = -1;
    }
    
    
    public void addNum(int num) {
        count[num]++;
        totalCount++;
        if (num < left) {
            curSum++;
        }
        if (left == -1) {
            left = num;
            right = left + 1;
        }
        
    }
    
    public double findMedian() {
        while ((curSum + count[left]) < (totalCount/2)) {
            curSum += count[left];
            left++;
        }
        while (curSum >= (totalCount/2)) {
            left--;
            curSum -= count[left];
        }
        
        if (curSum + count[left] == (totalCount/2)) {
            right = left + 1;
            while (count[right] == 0) {
                right++;
            }
            return (double) (left + right)/2;
        }

        return left;

    }
}
*/
