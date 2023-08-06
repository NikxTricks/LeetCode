class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        
        for (int i = 0; i < n + 1; i++) {
            if (i%2 == 0) {
                out[i] = out[i/2];
            }
            if (i%2 == 1) {
                    out[i] = out[i - 1] + 1;
            }

        }
        
        return out;
    }
}