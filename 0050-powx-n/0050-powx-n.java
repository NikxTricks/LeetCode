class Solution {
    public double myPow(double x, int n) {
      double odds = 1;
        long exp = n;
        
        if (n < 0) {
            x = 1/x;
            exp *= -1;
        }
        
        
        double base = x;
        double out = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                out *= x;
               // exp--;
            }
                x *= x;
                exp /= 2;
            //System.out.printf("%f ,%f, %f\n", out, odds, x);
        }
        
        return out;
        
        
        
    }
}