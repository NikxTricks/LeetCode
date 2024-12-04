class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder out = new StringBuilder(s);
        Stack<Integer> order = new Stack<>();
        Set<Integer> removal = new HashSet<>();
        
        //int n = s.length();
        //System.out.println(n);
        for (int i = 0; i < out.length(); i++) {
            if (out.charAt(i) == '(') {
                order.push(i);
            }
            else if (out.charAt(i) == ')') {
                if (order.isEmpty()) {
                    //System.out.println(out.charAt(i));
                    out.deleteCharAt(i);
                    i--;
                }
                else {
                    order.pop();
                }
            }
        }
        
        //StringBuilder out = new StringBuilder(s);
        while (!order.isEmpty()) {
            out.deleteCharAt(order.pop());
        }


        return out.toString();
    }
}