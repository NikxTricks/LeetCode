class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        String substring = "";
        int p = 0;
        char[] chars = s.toCharArray();
        for (int i = p; i < s.length(); i++) {
            if (substring.indexOf(chars[i]) == -1) {
                substring+=chars[i];
                max = Math.max(max, substring.length());
            }
            else {
                p++;
                i = p;
                substring = "";
                substring += chars[i];
            }
        }
        
        return max;
    }
}