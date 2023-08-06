class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < 32; j++) {
                out[i]+= (i>>j) & 1;
            }
        }
        
        return out;
    }
}