class MinStack {

    Stack<Integer> data;
    Stack<Integer> min;
    
    public MinStack() {
        data = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            System.out.println(val);
            min.push(val);
        }
        data.push(val);
    }
    
    public void pop() {
        if (data.size() > 0) {
            int out = data.pop();
            if (out == min.peek()) {
            min.pop();
            }
        }

    }
    
    public int top() {
        if (data.size() > 0) {
            return data.peek();
        }
        
        return -1;
    }
    
    public int getMin() {
            if (min.size() > 0) {
                return min.peek();
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