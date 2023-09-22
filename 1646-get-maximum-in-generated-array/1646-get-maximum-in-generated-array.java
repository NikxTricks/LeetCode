class Solution {
    public int getMaximumGenerated(int n) {
        int[] data = new int[n + 1];
        Arrays.fill(data, -1);
        int max = 0;
        for (int i = n; i >= 0; i--) {
            max = Math.max(max, helper(i, data));
        }
        
        return max;
    }
    
    
    public int helper(int n, int[] data) {
        if (n <= 1) {
            data[n] = n;
            return n;
        }
        if (data[n] != -1) {
           return data[n]; 
        }
        if (n%2 == 0) {
                data[n] = helper(n/2, data);
                return data[n];
        }
        else {
            data[n] += helper(n/2, data) + 1;
            data[n] += helper(n/2 + 1, data);
            return data[n];
        }
        
    }
}