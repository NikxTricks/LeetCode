class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        String[] paths = path.split("/");
        
        for (int i = 0; i < paths.length; i++) {
            if (paths[i].equals("") || paths[i].equals(".")) {
                continue;
            }
            else if (paths[i].equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(paths[i]);
            }
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