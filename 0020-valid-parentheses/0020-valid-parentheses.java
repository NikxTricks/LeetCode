class Solution {
    public boolean isValid(String s) {
        if (s.length()%2 != 0) {
            return false;
        }
        
        Stack<Character> reverse = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                reverse.push(')');
                
            }
            else if (s.charAt(i) == '[') {
                reverse.push(']');
                
            }
            else if (s.charAt(i) == '{') {
                reverse.push('}');
                
            }
            else if (reverse.size() == 0 || reverse.pop() != s.charAt(i)) {
                return false;
            }
        }
        
        if (reverse.size() != 0) {
            return false;
        }
        
        return true;
    }
}