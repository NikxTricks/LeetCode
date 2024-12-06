class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        stack.push("/");
        
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
            StringBuilder cur = new StringBuilder(path.substring(prev, i));
            if (cur.toString().equals("..")) {
                if (stack.size() == 1) {
                    i++;
                    continue;
                }
                stack.pop();
                while (!stack.peek().equals("/")) {
                    stack.pop();
                }
                stack.pop();
            }
            else if (cur.toString().equals(".")) {
                i += 1;
                continue;
            }
            else {
                stack.push(cur.reverse().toString());
            }
                stack.push("/");
                i++; 
        }
        
        if (stack.size() > 1 && stack.peek().equals("/")) {
            stack.pop();
        }
        
        StringBuilder out = new StringBuilder();
        while (!stack.isEmpty()) {
            out.append(stack.pop());
        }
        
        return out.reverse().toString();
    }
    
}