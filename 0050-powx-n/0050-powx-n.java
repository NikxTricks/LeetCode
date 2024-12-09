class Solution {
    public double myPow(double x, int n) {
        double out = 1;
        
        long exp = n;
        
        if (n < 0) {
            x = 1/x;
            exp *= -1;
        }
        
        while (exp > 0) {
            if (exp % 2 == 1) { //2^(k + 1)
                out *= x;
            }
            
            x *= x;
            exp /= 2;
        }
        
        return out;
        
        
    }
}