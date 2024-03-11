class Solution {
    public String customSortString(String order, String s) {
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        Arrays.sort(chars, (a, b) -> order.indexOf(a) - order.indexOf(b)); 
        
        
        StringBuilder out = new StringBuilder();
        for (Character c: chars) {
            out.append(c);
        }
        
        return out.toString();
        }
        
        
}