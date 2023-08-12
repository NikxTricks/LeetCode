import java.util.HashMap;
import java.util.List;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String substring = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (substring.indexOf(chars[i]) == -1) {
                substring+=chars[i];
                max = Math.max(max, substring.length());
            }
            else {
                i -= (substring.length() - 1);
                substring = "";
                substring += chars[i];
            }
        }
        
        return max;
    }
}