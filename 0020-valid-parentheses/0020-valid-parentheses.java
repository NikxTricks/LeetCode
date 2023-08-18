class Solution {
    public boolean isValid(String s) {
        Stack<Character> check = new Stack<>();
        if (s.length()%2 != 0) {
            return false;
        }
        
        for (char c: s.toCharArray()) {
            if (c == '(') {
                check.push(')');
            }
            else if (c == '{') {
                check.push('}');
            }
            else if (c == '[') {
                check.push(']');
            }
            else if (check.isEmpty() || c != check.pop()) {
                return false;
            }
        }
        if (check.size() != 0) {
            return false;
        }
        return true;
    }
}