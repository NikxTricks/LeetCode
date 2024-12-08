class Solution {
    public String customSortString(String order, String s) {
        int[] pos = new int[26];
        List<Character> temp = new ArrayList<>();
        for (int i = 0; i < order.length(); i++) {
            pos[order.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < s.length(); i++) {
            temp.add(s.charAt(i));
        }
        
        Collections.sort(temp, (a, b) -> {
            return pos[a - 'a'] - pos[b - 'a'];
        });
        
        StringBuilder out = new StringBuilder();
        
        for (char c: temp) {
            out.append(c);
        }
        
        return out.toString();
    }
    
        
        
}