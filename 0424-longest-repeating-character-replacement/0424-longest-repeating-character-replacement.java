class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int front = 0;
        int back = 0;
        int maxChar = 0;
        int[] data = new int[26];
        while (back < s.length()) {
            data[s.charAt(back) - 'A']++;
            maxChar = Math.max(maxChar, data[s.charAt(back) - 'A']);
            back++; 
            
            
            if (back - front - maxChar > k) {
                
                data[s.charAt(front) - 'A']--;
                front++;
            }
            max = Math.max(max, back - front);
            
        }
        
        return max;
        
        
        
    }
}