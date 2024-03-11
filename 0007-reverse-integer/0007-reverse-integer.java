import java.lang.Math;
class Solution {
    public int reverse(int x) {
        boolean neg = false;
        if (x < 0) {
            neg = true;
        }
        x = Math.abs(x);
        int out = 0;
        while (x > 0) {
            if (out > Integer.MAX_VALUE/10) {
                return 0;
            }
            if ((out == Integer.MAX_VALUE && x%10 > 7)) {
                return 0;
            }
            out *= 10;
            out += x%10;
            x /= 10;
            
        }
        if (neg) {
           return out * -1; 
        }
        return out;
    }
    
}