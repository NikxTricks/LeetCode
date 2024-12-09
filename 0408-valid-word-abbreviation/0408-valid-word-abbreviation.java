class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        int num = 0;
        
        while (i < abbr.length()) {
            while (i < abbr.length() && Character.isDigit(abbr.charAt(i))) {
                if (abbr.charAt(i) - '0' == 0 && num == 0) {
                    return false;
                }
                num *= 10;
                num += (abbr.charAt(i) - '0');
                i++;
            }
            j += num;
            if (j >= word.length() || i >= abbr.length()) {
                break;
            }
            if (word.charAt(j) != abbr.charAt(i)) {
                return false;
            }
            i++;
            j++;
            num = 0;
        }
        
        return j == word.length() && i == abbr.length();
    }
}