class Solution {
    public String convert(String s, int numRows) {
        StringBuilder[] rows = new StringBuilder[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rows[i] = new StringBuilder();
        }
        
        int i = 0;
        while (i < s.length()) {
            for (int rowIndex = 0; rowIndex < numRows && i < s.length(); rowIndex++) {
                rows[rowIndex].append(s.charAt(i++));
            }
            for (int rowIndex = numRows - 2; rowIndex >= 1 && i < s.length(); rowIndex--) {
                rows[rowIndex].append(s.charAt(i++));
            }
        }
        
        for (int j = 1; j < rows.length; j++) {
            rows[0].append(rows[j]);
        }
        return rows[0].toString();
    }
}