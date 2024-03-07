class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int f = 0;
        int b = height.length - 1;
        while (f < b) {
            int area = Math.min(height[f], height[b]) * (b - f);
            max = Math.max(max, area);
            if (height[f] < height[b]) {
                f++;
            }
            else {
                b--;
            }
        }
        
        return max;
    }
}