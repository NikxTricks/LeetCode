class Solution {
    public boolean isAnagram(String s, String t) {
        int[] data = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            data[(s.charAt(i)) - 'a']++;
            data[(t.charAt(i)) - 'a']--;
        }
        
        for (int num: data) {
            if (num != 0) {
                return false;
            }
        }
        
        return true;
    }
}