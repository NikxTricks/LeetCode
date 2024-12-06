class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        int i = 1;
        while (i < path.length()) {
            int prev = i;
            while (i < path.length() && path.charAt(i) != '/') {
                i++;
            }
            if (prev == i) {
                i++;
                continue;
            }
            String cur = path.substring(prev, i);
            if (cur.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else if (!cur.equals(".")) {
                stack.push(cur);
            }
            i++; 
        }
        
        StringBuilder out = new StringBuilder();
        for (String cur: stack) {
            out.append("/");
            out.append(cur);
        }
        if (stack.size() == 0) {
            out.append("/");
        }
        
        return out.toString();
    }
    
}