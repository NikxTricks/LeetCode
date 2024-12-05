class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        
        int num = 0;
        int prev = 0;
        word += " ";
        abbr += " ";
        
        while (i < abbr.length()) {
            if (Character.isDigit(abbr.charAt(i))) {
                if (num == 0 && (abbr.charAt(i) - '0') == 0) {
                    return false;
                }
                num *= 10;
                num += (abbr.charAt(i) - '0');
                i++;
            }
            else {
                if (prev + num >= word.length() || abbr.charAt(i) != word.charAt(prev + num)) {
                    return false;
                }
                prev += (num + 1);
                i++;
                num = 0;
            }
        }
        
        
        return true;
    }
}