class Solution {
    public String longestPalindrome(String s) {
        int m = s.length();
        int max = 1;
        int start = 0;
        int end = 1;
        for (int cur = 0; cur < m; cur++) {
            int i = cur;
            int j = cur;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            
            if (j - i - 1 > max) {
                max = j - i - 1;
                start = i + 1;
                end = j;
            }
            
            i = cur; 
            j = cur + 1;
            while (i >= 0 && j < m && s.charAt(i) == s.charAt(j)) {
                i--;
                j++;
            }
            
            if (j - i - 1 > max) {
                max = j - i - 1;
                start = i + 1;
                end = j;
            }
            
        }
        //                         for (int w = 0; w < m; w++) {
        //     for (int d = 0; d < m; d++) {
        //         System.out.print(dp[w][d] + " ");
        //     }
        //     System.out.println("");
        // }
        return s.substring(start, end);
        
        
        
    }
}

