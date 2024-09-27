class Solution {
    public String longestPalindrome(String s) {
        int m = s.length();
        int max = 1;
        int start = 0;
        int end = 1;
        for (int cur = 0; cur < m; cur++) {
            int i = cur;
            int j = cur;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            
            if (j - i - 1 > max) {
                max = j - i - 1;
                start = i + 1;
                end = j;
            }
            
            i = cur; 
            j = cur + 1;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            
            if (j - i - 1 > max) {
                max = j - i - 1;
                start = i + 1;
                end = j;
            }
            
        }

        return s.substring(start, end);
        
        
        
    }
}

