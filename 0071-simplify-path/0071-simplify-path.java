class Solution {
    public String simplifyPath(String path) {
        Stack<Character> stack = new Stack<>();
        
        stack.push('/');
        
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
                if (stack.size() == 1) {
                    i++;
                    continue;
                }
                stack.pop();
                while (stack.peek() != '/') {
                    stack.pop();
                }
                stack.pop();
            }
            else if (cur.equals(".")) {
                i += 1;
                continue;
            }
            else {
                for (char c: cur.toCharArray()) {
                    stack.push(c);
                }
            }
                stack.push('/');
                i++; 
        }
        
        if (stack.size() > 1 && stack.peek() == '/') {
            stack.pop();
        }
        
        StringBuilder out = new StringBuilder();
        while (!stack.isEmpty()) {
            out.append(stack.pop());
        }
        
        return out.reverse().toString();
    }
    
}