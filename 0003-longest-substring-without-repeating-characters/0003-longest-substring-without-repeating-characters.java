class Solution {
    public int lengthOfLongestSubstring(String s) {
        int f = 0;
        int b = 0;
        int max = 0;
        HashSet<Character> visited = new HashSet<>();
        while (b < s.length()) {
            if (!visited.contains(s.charAt(b))) {
                visited.add(s.charAt(b));
                max = Math.max(b - f + 1, max);
                b++;
            }
            else {
                visited.remove(s.charAt(f));
                f++;
            }
        }
        
        return max;
    }
               
                       
}