class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        
        String out = "";
        
        int i = 0;
        int j = 0;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Map<Character, Integer> sCount = new HashMap<>();
        Map<Character, Integer> tCount = new HashMap<>();
        
        for (int w = 0; w < tArr.length; w++) {
            sCount.put(tArr[w], 0);
            tCount.put(tArr[w], tCount.getOrDefault(tArr[w], 0) + 1);
        }
        
        while (j < s.length()) {
            while (j < s.length() && !check(sCount, tCount)) {
                if (sCount.containsKey(sArr[j])) {
                    sCount.put(sArr[j], sCount.get(sArr[j]) + 1);
                }
                j++;
            }
            while (i < s.length() && check(sCount, tCount)) {
                String cur = s.substring(i, j);
                if (cur.length() < min) {
                    out = cur;
                    min = cur.length();
                }
                if (sCount.containsKey(sArr[i])) {
                    sCount.put(sArr[i], sCount.get(sArr[i]) - 1);
                }
                i++; 
            }
        }
        return out;
    }
    
    public boolean check(Map<Character, Integer> sCount, Map<Character, Integer> tCount) {
        for (Map.Entry<Character, Integer> entry: sCount.entrySet()) {
            if (entry.getValue() < tCount.get(entry.getKey())) {
                return false;
            }
        }
        
        return true;
    }
}