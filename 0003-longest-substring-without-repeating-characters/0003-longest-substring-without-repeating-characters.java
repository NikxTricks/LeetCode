class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        HashSet<Character> data = new HashSet<>();
        int left = 0;
        int right = 0;
        char[] chars = s.toCharArray();
        while (right < chars.length) {
            if (!data.contains(chars[right])) {
                data.add(chars[right]);
                max = Math.max(max, data.size());
            }
            else {
                while (data.contains(chars[right])) {
                    data.remove(chars[left]);
                    left++;
                }
                data.add(chars[right]);
                
            }
            right++;
        }
        
         return max;
        
    }
               
                       
}