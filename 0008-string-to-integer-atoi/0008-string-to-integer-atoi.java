class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int i = 0;
        while (i < s.length() && s.charAt(i) == ' ') {
          i++;
        }
        if (i == s.length()) {
            return 0;
        }
        char c = 0;
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign *= -1;
            i++;
        }
        else if (s.charAt(i) == '+') {
            i++;
        }
        int sum = 0;
        while (i < s.length() && s.charAt(i) - '0' < 10 && s.charAt(i) - '0' >= 0) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == ' ') {
                return 0;
            }
            if (sum > Integer.MAX_VALUE/10) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            if (sum == Integer.MAX_VALUE/10 && (s.charAt(i) - '0') > 7) {
                if (sign == -1) {
                    return Integer.MIN_VALUE;
                }
                return Integer.MAX_VALUE;
            }
            sum *= 10;
            sum += (s.charAt(i) - '0');
            i++;
        }
        
        return sum * sign;
        
    }
}