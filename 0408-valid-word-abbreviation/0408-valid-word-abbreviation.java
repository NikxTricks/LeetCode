class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        
        int num = 0;
        int prev = 0;
        word += " ";
        abbr += " ";
        
        while (i < abbr.length()) {
            char c = abbr.charAt(i);
            if (Character.isDigit(c)) {
                if (num == 0 && (c - '0') == 0) {
                    return false;
                }
                num *= 10;
                num += (c - '0');
                i++;
            }
            else {
                if (prev + num >= word.length() || c != word.charAt(prev + num)) {
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