class Solution {
    public int myAtoi(String s) {
        if (s.length() == 0) {
            return 0;
        }
        while (s.length() > 0 && s.charAt(0) == ' ') {
           s = s.replaceFirst(" ", ""); 
        }
        if (s.length() == 0) {
            return 0;
        }
        char c = 0;
        int i = 0;
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
                sum = Integer.MAX_VALUE;
                break;
            }
            if (sum == Integer.MAX_VALUE/10 && (s.charAt(i) - '0') > 7) {
                sum = Integer.MAX_VALUE;
                break;
            }
            if (sum < Integer.MIN_VALUE/10) {
                sum = Integer.MIN_VALUE;
                break;
            }
            if (sum == Integer.MIN_VALUE/10 && (s.charAt(i) - '0') > 8) {
                sum = Integer.MIN_VALUE;
                break;
            }
            
            
            sum *= 10;
            sum += sign * (s.charAt(i) - '0');
            i++;
        }
        
        return sum;
        
    }
}