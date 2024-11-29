class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        StringBuilder c = new StringBuilder(s);        
        
        boolean removed = false;
        int f = 0;
        int b = n - 1;
        boolean first = true;
        boolean second = true;
        
        while (f < c.length()/2) {
            if (c.charAt(f) != c.charAt(b)) {
                if (removed) {
                    first = false;
                    break;
                }
                removed = true;
                if (b - 1 >= 0 && c.charAt(b - 1) == c.charAt(f)) {
                    c.replace(b, b + 1, "");
                }
                else {
                    c.replace(f, f + 1, "");
                }
                b--;
                continue;
            }
            f++;
            b--;
        }
        
        removed = false;
        c = new StringBuilder(s);
        f = 0;
        b = n - 1;
        
        while (f < c.length()/2) {
            if (c.charAt(f) != c.charAt(b)) {
                if (removed) {
                    second = false;
                    break;
                }
                removed = true;
                if (f + 1 < c.length() && c.charAt(f + 1) == c.charAt(b)) {
                    c.replace(f, f + 1, "");
                }
                else {
                    c.replace(b, b + 1, "");
                }
                b--;
                continue;
            }
            f++;
            b--;
        }
        
        return first || second;
    }
}