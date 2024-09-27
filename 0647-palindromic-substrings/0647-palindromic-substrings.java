class Solution {
    public int countSubstrings(String s) {
        int m = s.length();
        int count = 0;
        for (int cur = 0; cur < m; cur++) {
            int i = cur;
            int j = cur;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                count++;
            }
            
            i = cur; 
            j = cur + 1;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
                count++;
            }
            
        }

        return count;
        
        
    }
}