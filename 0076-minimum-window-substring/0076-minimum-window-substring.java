class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        
        String out = "";
        
        int i = 0;
        int j = 0;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        int[] sCount = new int[128];
        int[] tCount = new int[128];
        //Map<Character, Integer> sCount = new HashMap<>();
        //Map<Character, Integer> tCount = new HashMap<>();
        
        for (int w = 0; w < tArr.length; w++) {
            tCount[tArr[w]]++;
        }
        
        while (j < s.length()) {
            while (j < s.length() && !check(sCount, tCount)) {
                if (tCount[sArr[j]] != 0) {
                    sCount[sArr[j]]++;
                }
                j++;
            }
            while (i < s.length() && check(sCount, tCount)) {
                if (j - i - 1 < min) {
                    out = s.substring(i, j);
                    min = j - i - 1;
                }
                if (sCount[sArr[i]] != 0) {
                    sCount[sArr[i]]--;
                }
                i++; 
            }
        }
        return out;
    }
    
    public boolean check(int[] sCount, int[] tCount) {
        for (int i = 0; i < sCount.length; i++) {
            if (sCount[i] < tCount[i]) {
                return false;
            }
        }
        
        return true;
    }
}