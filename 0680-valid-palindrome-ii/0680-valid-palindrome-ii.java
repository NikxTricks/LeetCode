class Solution {
    public boolean validPalindrome(String s) {
            
        int i = 0;
        int j = s.length() - 1;
        
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return helper(s, i + 1, j) || helper(s, i, j - 1);
            }
            
            i++;
            j--;
        }
        
        return true;
    }
    
    private boolean helper(String word, int s, int e) {
        while (s < e) {
            if (word.charAt(s) != word.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        
        return true;
    }
    
}