public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ref = 1;
        int flip = 0;
        int bit = 0;
        for (int i = 0; i < 32; i++) {
            flip = flip<<1;
            bit = (n & ref);
            flip = (flip | bit);
            
            n = n>>1; 
            
        }
        return flip;
    }
}