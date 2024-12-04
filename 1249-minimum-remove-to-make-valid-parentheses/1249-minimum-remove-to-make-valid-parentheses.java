class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder out = new StringBuilder(s);
        Stack<Integer> order = new Stack<>();
        
        for (int i = 0; i < out.length(); i++) {
            if (out.charAt(i) == '(') {
                order.push(i);
            }
            else if (out.charAt(i) == ')') {
                if (order.isEmpty()) {
                    out.deleteCharAt(i);
                    i--;
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