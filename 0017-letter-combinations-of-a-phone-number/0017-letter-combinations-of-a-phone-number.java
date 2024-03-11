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
        String cur = "";
        helper(out, keys, cur, count, digits);
        return out;
    }
    
    public void helper(List<String> out, String[] keys, String cur, int count, String digits) {
        //System.out.println(count);
        for (char c: keys[Integer.valueOf(String.valueOf(digits.charAt(count))) - 2].toCharArray()) {
            cur += c;
            //System.out.println("Start cur: " + cur);
            if (cur.length() == digits.length()) {
                //System.out.println(cur);
                out.add(cur);
                //System.out.println("Cur: " + cur);
                //cur = cur.substring(0, cur.length() - 1);
            }
            else {
                //System.out.println("Cur: " + cur);
                //System.out.println(count);
                helper(out, keys, cur, count + 1, digits);
            }
            cur = cur.substring(0, cur.length() - 1);
            //System.out.println(cur);
        }
    }
}