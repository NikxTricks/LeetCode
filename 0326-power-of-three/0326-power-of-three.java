class Solution {
    public boolean isPowerOfThree(int n) {
        double cur = n;
        
        while (cur > 1) {
           cur = cur/3; 
        }
        
        if (cur == 1) {
           return true; 
        }
        
        return false;
    }
}