import java.util.HashMap;
import java.util.List;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String substring = "";
        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(s.charAt(i)) == -1) {
                substring+=s.charAt(i);
                max = Math.max(max, substring.length());
            }
            else {
                i -= (substring.length() - 1);
                substring = "";
                substring += s.charAt(i);
            }
        }
        
        return max;
    }
}