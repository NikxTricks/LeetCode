class Solution {
    public boolean isValid(String s) {
        Stack<Character> order = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                order.add(c);
            }
            else if (c == ')' && (order.isEmpty() || order.pop() != '(')) {
                return false;
            }
            else if (c == '}' && (order.isEmpty() || order.pop() != '{')) {
                return false;
            }
            else if (c == ']' && (order.isEmpty() || order.pop() != '[')) {
                return false;
            }
        }
        
        if (!order.isEmpty()) {
            return false;
        }
        
        return true;
    }
}