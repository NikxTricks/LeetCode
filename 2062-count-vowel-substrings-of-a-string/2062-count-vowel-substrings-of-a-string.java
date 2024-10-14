class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        int[] charcount = new int[128];
        for (int i = 0; i < word.length(); i++) {
            int j = i;
            Set<Character> curvowels = new HashSet<>();
            curvowels.add('a');
            curvowels.add('e');
            curvowels.add('i');
            curvowels.add('o');
            curvowels.add('u');
            while (j < word.length() && vowels.contains(word.charAt(j))) {
                curvowels.remove(word.charAt(j)); 
                if (curvowels.isEmpty()) {
                    count++;
                }
                j++;
            }
        }
        
        return count;
    }
}
                   
                   