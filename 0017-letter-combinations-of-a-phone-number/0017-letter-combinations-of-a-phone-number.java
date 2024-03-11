class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> out = new ArrayList<>();
        if (digits.length() == 0) {
            return out; 
        }
        String[] keys = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        int count = 0;
        helper(out, keys, new StringBuilder(), count, digits);
        return out;
    }
    
    public void helper(List<String> out, String[] keys, StringBuilder output, int count, String digits) {
        String cur = keys[(digits.charAt(count) - '0') - 2];
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