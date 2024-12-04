class Solution {
    public int minAddToMakeValid(String s) {
        int open = 0;
        
        int n = s.length();
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                open++;
            }
            else if (s.charAt(i) == ')') {
                if (open == 0) {
                    count++;
                }
                else {
                    open--;
                }
            }
        }
        
        return count + open;
    }
}