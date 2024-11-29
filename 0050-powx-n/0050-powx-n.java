class Solution {
    public double myPow(double x, int n) {
        double out = 1.0;
        long num = n;
        if (n == 0) {
            return out;
        }
        if (x == 1) {
            return x;
        }
        if (x == -1) {
            return n % 2 == 1 ? -1 : 1;
        }
        while (num < 0) {
            x = 1 / x;
            num *= -1;
        } 
        while (num > 0) {
            if (num % 2 == 1) {
                out *= x;
            }
            x *= x;
            num /= 2;
        }          

        
        return out;
    }
}