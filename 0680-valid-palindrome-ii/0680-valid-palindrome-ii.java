class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        
        boolean removed = false;
        int f = 0;
        int b = n - 1;
        
        while (f < b) {
            if (s.charAt(f) == s.charAt(b)) {
                f++;
                b--;
            }
            else {
                return helper(s, f + 1, b) || helper(s, f, b - 1);
            }
            
        }
        
        return true;
    }
    
    
    public boolean helper(String s, int i, int j) {        
        boolean removed = false;
        int f = i;
        int b = j;
        
        while (f < b) {
            if (s.charAt(f) == s.charAt(b)) {
                f++;
                b--;
            }
            else {
                return false;
            }
            
        }
        
        return true;
    }
}