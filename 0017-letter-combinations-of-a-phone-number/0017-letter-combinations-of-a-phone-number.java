class Solution {
    public List<String> letterCombinations(String digits) {
         List<String> out = new ArrayList<>();
        if (digits.length() == 0) {
            return out; 
        }
        String[] keys = new String[8];
        keys[0] = "abc";
        keys[1] = "def";
        keys[2] = "ghi";
        keys[3] = "jkl";
        keys[4] = "mno";
        keys[5] = "pqrs";
        keys[6] = "tuv";
        keys[7] = "wxyz";
        
       
        int count = 0;
        StringBuilder output = new StringBuilder();
        helper(out, keys, output, count, digits);
        return out;
    }
    
    public void helper(List<String> out, String[] keys, StringBuilder output, int count, String digits) {
        String cur = keys[Integer.valueOf(String.valueOf(digits.charAt(count))) - 2];
        for (int i = 0; i < cur.length(); i++) {
            char c = cur.charAt(i);
            output.append(c);
            if (output.length() == digits.length()) {
                out.add(output.toString());
            }
            else {
                helper(out, keys, output, count + 1, digits);
            }
            output.delete(output.length() - 1, output.length());
        }
    }
}