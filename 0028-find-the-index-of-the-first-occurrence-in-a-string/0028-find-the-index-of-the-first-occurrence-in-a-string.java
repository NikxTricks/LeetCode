import java.util.HashMap;

class Solution {
 
    public int strStr(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        int i = 0;
        int j = 0;
        while (i <= m - n) {
            j = 0;
            while (j < n && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needle.length()) {
                return i;
            }
            else {
                i++;
            }
        
        }
        return -1;
}
}