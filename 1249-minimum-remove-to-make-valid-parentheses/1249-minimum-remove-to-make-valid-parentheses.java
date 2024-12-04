class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder out = new StringBuilder(s);
        Stack<Integer> order = new Stack<>();
        
        int n = out.length();
        for (int i = 0; i < n; i++) {
            if (out.charAt(i) == '(') {
                order.push(i);
            }
            else if (out.charAt(i) == ')') {
                if (order.isEmpty()) {
                    out.deleteCharAt(i--);
                    n--;
                }
                else {
                    order.pop();
                }
            }
        }

        while (!order.isEmpty()) {
            out.deleteCharAt(order.pop());
        }


        return out.toString();
    }
}