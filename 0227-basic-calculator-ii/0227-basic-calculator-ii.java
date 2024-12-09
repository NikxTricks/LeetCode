class Solution {
    public int calculate(String s) {
        Stack<Integer> nums = new Stack<>();
        
        int i = 0;
        int num = 0;
        char prev = '+';
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num *= 10;
                num += (c - '0');
            }
            if (c == '+' || c == '-' || c == '*' || c == '/' || i == s.length() - 1) {
                if (prev == '+') {
                    nums.push(num);
                }
                else if (prev == '-') {
                    nums.push(num * -1);
                }
                else if (prev == '*') {
                    nums.push(nums.pop() * num);
                }
                else {
                    nums.push(nums.pop() / num);     
                }
                prev = c;
                num = 0;
            }
            i++;
        }
        
        int out = 0;
        while (!nums.isEmpty()) {
            out += nums.pop();
        }
        
        return out;
    }
    
}