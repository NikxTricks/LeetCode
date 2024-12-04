class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Integer> order = new Stack<>();
        
        int n = s.length();
        
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                order.push(i);
            }
            else if (s.charAt(i) == ')') {
                if (order.isEmpty()) {
                    count++;
                }
                else {
                    order.pop();
                }
            }
        }
        
        return count + order.size();
    }
}