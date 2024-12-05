class Solution {
    public int calculate(String s) {
        Stack<Integer> order = new Stack<>();
        
        
        int cur = 0;
        char op = '+';
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                cur *= 10;
                cur += (c - '0');
            }
            if (isOp(c) || i == s.length() - 1) {
                switch (op) {
                    case '+':
                        order.push(cur);
                        break;
                    case '-':
                        order.push(cur * -1);
                        break;
                    case '*':
                        order.push(order.pop() * cur);
                        break;
                    case '/':
                        order.push(order.pop() / cur);
                        break;
                }

                op = c;
                cur = 0;
            }
        }
        
        int ans = 0;
        while (!order.isEmpty()) {
            ans += order.pop();
        }
 
        return ans;
    }
    
    
    private boolean isOp(char c) {
        return c == '+' || c == '-' || c == '/' || c == '*';
    }
}