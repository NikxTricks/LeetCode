class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        
        int n = abbr.length();
        int num = 0;
        while (i < n) {
            while (i < n && Character.isDigit(abbr.charAt(i))) {
                num *= 10;
                if (num == 0 && abbr.charAt(i) - '0' == 0) {
                    return false;
                }
                num += (abbr.charAt(i) - '0');
                i++;
            }
            j += num;
            if (i >= n || j >= word.length()) {
                break;
            }
            if (abbr.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j++;
            num = 0;
        }
        
        return j == word.length() && i == abbr.length();
    }
}