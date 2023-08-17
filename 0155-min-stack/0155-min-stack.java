class MinStack {

    Stack<Integer> data;
    PriorityQueue<Integer> min;
    
    public MinStack() {
        data = new Stack<>();
        min = new PriorityQueue<>();
    }
    
    public void push(int val) {
        data.push(val);
        min.add(val);
    }
    
    public void pop() {
        if (data.size() > 0) {
            List<Integer> temp = new LinkedList<>();
            int cur = data.pop();
            int check = min.remove();
            while (cur != check) {
                temp.add(0, check);
                check = min.remove();
            }
                min.addAll(temp);
        }
        return;
        
    }
    
    public int top() {
        if (data.size() > 0) {
            return data.peek();
        }
        
        return -1;
    }
    
    public int getMin() {
            if (min.size() > 0) {
                int minVal = min.peek();
                return minVal;
            }
        
        return -1;

        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */