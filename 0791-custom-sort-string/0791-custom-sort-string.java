class Solution {
    public String customSortString(String order, String s) {
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        //char[] chars = s.toCharArray();
        Comparator<Character> custom = new Comparator<>() {
            @Override
            public int compare(Character a, Character b) {
                return order.indexOf(a) - order.indexOf(b);

            }
        };
        
        Arrays.sort(chars, custom); 
        
        
        StringBuilder out = new StringBuilder();
        for (Character c: chars) {
            out.append(c);
        }
        
        return out.toString();
        }
        
        
}