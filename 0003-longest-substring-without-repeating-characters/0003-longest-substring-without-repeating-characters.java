class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> data = new HashSet<>();
        int left = 0;
        int right = 0;
        //char[] chars = s.toCharArray();
        while (right < s.length()) {
            if (!data.contains(s.charAt(right))) {
                data.add(s.charAt(right));
                max = Math.max(max, data.size());
            }
            else {

                    data.remove(s.charAt(left));
                    left++;
                    continue;
                
                
            }
            right++;
        }
        
         return max;
        
    }
               
                       
}