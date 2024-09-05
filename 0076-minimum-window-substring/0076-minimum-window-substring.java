class Solution {
    public String minWindow(String s, String t) {
        int min = Integer.MAX_VALUE;
        
        int minI = 0;
        int minJ = 0;
        
        int check = 0;
        int formed = 0;
        
        String out = "";
        
        int i = 0;
        int j = 0;
        
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        
        int[] sCount = new int[58];
        int[] tCount = new int[58];
        
        for (int w = 0; w < tArr.length; w++) {
            if (tCount[tArr[w] - 'A'] == 0) {
                check++;
            }
            tCount[tArr[w] - 'A']++;
        }
        
        while (j < s.length()) {
            while (j < s.length() && formed < check) {
                sCount[sArr[j] - 'A']++;
                if (sCount[sArr[j] - 'A'] == tCount[sArr[j] - 'A'] && tCount[sArr[j] - 'A'] != 0) {
                    formed++;
                }
                j++;
            }
            while (i < s.length() && formed >= check) {
                if (j - i - 1 < min) {
                    min = j - i - 1;
                    minI = i;
                    minJ = j;
                }
                sCount[sArr[i] - 'A']--;
                if (tCount[sArr[i] - 'A'] != 0 && sCount[sArr[i] - 'A'] < tCount[sArr[i] - 'A']) {
                    formed--;
                }
                i++; 
            }
        }
        return s.substring(minI, minJ);
    }
    
//     public boolean check(int[] sCount, int[] tCount) {
//         for (int i = 0; i < sCount.length; i++) {
//             if (tCount[i] != 0 && sCount[i] < tCount[i]) {
//                 return false;
//             }
//         }
        
//         return true;
//     }
}