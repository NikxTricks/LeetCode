class Solution {
    public boolean isAnagram(String s, String t) {
        int[] data = new int[26];
        if (s.length() != t.length()) {
            return false;
        }
        
        for (int i = 0; i < s.length(); i++) {
            data[((int) s.charAt(i)) - 97] = data[((int) s.charAt(i)) - 97] + 1;
            data[((int) t.charAt(i)) - 97] = data[((int) t.charAt(i)) - 97] - 1;
        }
        
        for (int num: data) {
            if (num != 0) {
                return false;
            }
        }
        
        return true;
    }
}