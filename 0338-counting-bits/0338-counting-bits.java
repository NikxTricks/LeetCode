class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        int max = 1;
        for (int i = 0; i < n + 1; i++) {
            if (i%2 == 1) {
                    out[i] = out[i - 1] + 1;
                    continue;
            }
            for (int j = 0; j < 32; j++) {
                out[i]+= (i>>j) & 1;
            }
        }
        
        return out;
    }
}