class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> data = new HashMap<>();
        String big = "";
        String small = "";
        if (s.length() > t.length()) {
            big = s;
            small = t;
        }
        else {
            big = t;
            small = s;
        }
        for (int i = 0; i < small.length(); i++) {
            if (data.containsKey(small.charAt(i))) {
                data.put(small.charAt(i), data.get(small.charAt(i)) + 1);
            }
            else {
                data.put(small.charAt(i), 1);
            }
        }
        
        for (int i = 0; i < big.length(); i++) {
            if (!data.containsKey(big.charAt(i))) {
                return false;
            }
            else if (data.get(big.charAt(i)) == 0) {
                return false;
            }
            else {
                data.put(big.charAt(i), data.get(big.charAt(i)) - 1);
            }
        }
        return true;
    }
}