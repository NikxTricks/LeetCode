import java.lang.Math;
class Solution {
    public int titleToNumber(String columnTitle) {
        final int BASE = 26;
        int out = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            int value = ((int) (columnTitle.charAt(columnTitle.length() - 1  - i))) - 64;
            out = out + value * (int) Math.pow(26, i);
        }
        return out;
    }
}