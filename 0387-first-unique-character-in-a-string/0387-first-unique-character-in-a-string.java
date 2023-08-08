class Solution {
    public int firstUniqChar(String s) {

        int[] data = new int[26];
        
        for (int i = 0; i < s.length(); i++) {
            data[s.charAt(i) - 'a'] = data[s.charAt(i) - 'a'] + 1;
        }
        
        for (int i = 0; i < s.length(); i++) {
            
            if (data[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        
        return -1;
        
    }
}