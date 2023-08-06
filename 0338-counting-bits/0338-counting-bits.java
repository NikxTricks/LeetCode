class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        int max = 2;
        if ((n + 1)>= 1) {
            out[0] = 0;
        }
        if ((n + 1) >= 2) {
            out[1] = 1; 
        }
        for (int i = 2; i < n + 1; i++) {
            if (i%2 == 1) {
                    out[i] = out[i - 1] + 1;
                    continue;
            }
            if (i == max) {
                out[i] = 1;
                max *= 2;
            }
            out[i] = out[i - (max/2)] + out[(max/2)];
        }
        
        return out;
    }
}