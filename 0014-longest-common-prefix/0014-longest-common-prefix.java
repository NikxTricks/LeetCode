class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder lcp = new StringBuilder();
        
        Arrays.sort(strs);
        
        String f = strs[0];
        String l = strs[strs.length - 1];
        
        for (int i = 0; i < Math.min(f.length(), l.length()); i++) {
            if (f.charAt(i) != l.charAt(i)) {
                return lcp.toString();
            }
            
            lcp.append(f.charAt(i));
            
        }
        
        return lcp.toString();
    }
}