class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> data = new HashMap<>();
for (int i = 0; i < s.length(); i++) {
    data.put(s.charAt(i), data.getOrDefault(s.charAt(i), 0) + 1);
}
        for (int i = 0; i < s.length(); i++) {
            if (data.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        
        return -1;
        
    }
}