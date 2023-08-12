class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> data = new HashSet<>();
        int p = 0;
        char[] chars = s.toCharArray();
        for (int i = p; i < s.length(); i++) {
            if (!data.contains(chars[i])) {
                data.add(chars[i]);
                max = Math.max(max, data.size());
            }
            else {
                p++;
                i = p;
                data.clear();
                data.add(chars[i]);
            }
        }
        
        return max;
    }
}