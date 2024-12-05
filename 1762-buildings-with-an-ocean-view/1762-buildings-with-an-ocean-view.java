class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> order = new Stack<>();
        
        int max = heights[heights.length - 1];
        order.add(heights.length - 1);
        for (int i = heights.length - 2; i >= 0; i--) {
            if (heights[i] > max) {
                order.add(i);
                max = heights[i];
            }
        }
        
        int[] out = new int[order.size()];
        for (int i = 0; i < out.length; i++) {
            out[i] = order.pop();
        }
        
        return out;
    }
}