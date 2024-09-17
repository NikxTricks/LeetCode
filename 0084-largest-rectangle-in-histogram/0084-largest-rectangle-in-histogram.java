class Solution {
    static int largestRectangleArea(int hist[])
    {
        int n = hist.length;
        
        int max = 0;
        Stack<Integer> inc = new Stack<>();
        int i = 0;
        while (i < hist.length) {
            if (inc.size() == 0 || hist[inc.peek()] <= hist[i]) {
                inc.push(i);
                i++;
            }
            else {
                int cur = inc.pop();
                if (inc.isEmpty()) {
                   max = Math.max(hist[cur] * (i), max);
                }
                else {
                    max = Math.max(hist[cur] * (i - inc.peek() - 1), max);
                }
            }
        }
        
        while (!inc.isEmpty()) {
                int cur = inc.pop();
                if (inc.isEmpty()) {
                   max = Math.max(hist[cur] * (i), max);
                }
                else {
                    max = Math.max(hist[cur] * (i - inc.peek() - 1), max);
                }
        }
        
        return max;
    }
   
}