class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        
        int n = abbr.length();
        int num = 0;
        while (i < n) {
            while (i < n && Character.isDigit(abbr.charAt(i))) {
                int digit = abbr.charAt(i) - '0';
                if (num == 0 && digit == 0) {
                    return false;
                }
                num *= 10;
                num += digit;
                i++;
            }
            j += num;
            if (j >= word.length() || i >= n) {
                break;
            }
            if (word.charAt(j) != abbr.charAt(i)) {
                return false;
            }
            i++;
            j++;
            num = 0;
        }
        
        return j == word.length() && i == n;
    }
}