class Solution {
    public boolean isValid(String s) {
        Stack<Character> order = new Stack<>();
        
        char[] chars = s.toCharArray();
        for (char c: chars) {
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