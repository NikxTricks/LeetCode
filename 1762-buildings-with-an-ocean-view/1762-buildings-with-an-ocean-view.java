class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> order = new Stack<>();
        
        int n = heights.length;
        int max = heights[n - 1];
        order.add(n - 1);
        for (int i = n - 2; i >= 0; i--) {
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