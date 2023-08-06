class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n + 1];
        int count = 0;
        int place = 0;
        int prev = 1;
        int track = 2;
        for (int i = 0; i < n + 1; i++) {
            count = 0;
            for (int j = 0; j < 32; j++) {
                count+= (i>>j) & 1;
            }
            out[i] = count;
            track--;
            if (track == 0) {
               prev *= 2;
                track = prev;
            }
        }
        
        return out;
    }
}