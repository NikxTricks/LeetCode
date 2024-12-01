class Solution {
    public boolean isValid(String s) {
        Stack<Character> order = new Stack<>();
        Set<Character> opens = new HashSet<>();
        opens.add('(');
        opens.add('{');
        opens.add('[');
        
        Set<Character> closes = new HashSet<>();
        closes.add(')');
        closes.add('}');
        closes.add(']');
        
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (opens.contains(c)) {
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