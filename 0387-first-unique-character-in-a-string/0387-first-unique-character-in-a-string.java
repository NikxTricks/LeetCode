class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character, Integer> data = new HashMap<>();
for (int i = 0; i < s.length(); i++) {
          if (!data.containsKey(s.charAt(i))) {
           data.put(s.charAt(i), 1);
        }  
    else {
        data.put(s.charAt(i), data.get(s.charAt(i)) + 1);
    }
}
        for (int i = 0; i < s.length(); i++) {
            if (data.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        
        return -1;
        
    }
}