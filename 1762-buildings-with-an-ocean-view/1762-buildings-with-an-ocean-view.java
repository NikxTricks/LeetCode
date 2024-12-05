class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> order = new Stack<>();
        
        int n = heights.length;
        
        for (int i = 0; i < n; i++) {  
            while (!order.isEmpty() && heights[order.peek()] <= heights[i]) {
                order.pop();
            }
            order.push(i);
        }
    
        int[] out = new int[order.size()];
        for (int i = out.length - 1; i >= 0; i--) {
            out[i] = order.pop();
        }
        
        return out;
    }
}