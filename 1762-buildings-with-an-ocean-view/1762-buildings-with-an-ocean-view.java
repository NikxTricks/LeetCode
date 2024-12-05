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
        
        
        Integer[] temp = order.toArray(new Integer[order.size()]);
        
        int[] out = new int[order.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = temp[i];
        }
        
        return out;
    }
}