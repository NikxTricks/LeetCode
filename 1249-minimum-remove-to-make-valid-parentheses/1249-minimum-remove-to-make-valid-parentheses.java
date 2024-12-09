class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> opens = new Stack<>();
        StringBuilder out = new StringBuilder(s);
        
        
        for (int i = 0; i < out.length(); i++) {
            if (out.charAt(i) == ')') {
                if (opens.isEmpty()) {
                    out.deleteCharAt(i);
                    //System.out.println(i);
                    i--;
                }
                else {
                    opens.pop();
                }
            }
            else if (out.charAt(i) == '(') {
                opens.push(i);
            }
        }
        
        while (!opens.isEmpty()) {
            out.deleteCharAt(opens.pop());
        }
        
        return out.toString();
        
        
    }
}