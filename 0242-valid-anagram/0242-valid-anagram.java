class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        int[] sarr = new int[s.length()];
        int[] tarr = new int[s.length()];
        
        for (int i = 0; i < s.length(); i++) {
            sarr[i] = (int) s.charAt(i);
            tarr[i] = (int) t.charAt(i);
        }
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);
        
        for (int i = 0; i < s.length(); i++) {
            if (sarr[i] != tarr[i]) {
                return false;
            }
        }
        return true;
    }
}