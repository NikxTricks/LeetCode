class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        
        String out = "";
        
        int i = 0;
        int j = 0;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        int[] sCount = new int[58];
        int[] tCount = new int[58];
        
        for (int w = 0; w < tArr.length; w++) {
            tCount[tArr[w] - 'A']++;
        }
        
        while (j < s.length()) {
            while (j < s.length() && !check(sCount, tCount)) {
                sCount[sArr[j] - 'A']++;
                j++;
            }
            while (i < s.length() && check(sCount, tCount)) {
                if (j - i - 1 < min) {
                    out = s.substring(i, j);
                    min = j - i - 1;
                }
                sCount[sArr[i] - 'A']--;
                i++; 
            }
        }
        return out;
    }
    
    public boolean check(int[] sCount, int[] tCount) {
        for (int i = 0; i < sCount.length; i++) {
            if (tCount[i] != 0 && sCount[i] < tCount[i]) {
                return false;
            }
        }
        
        return true;
    }
}