class Solution {
    public int fib(int n) {
        return helper(n);
    }
    
    public int helper(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        
        return helper(n - 1) + helper(n - 2);
        
        
    }
}