class Solution {
    public int countVowelSubstrings(String word) {
        int count = 0;
        
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for (int i = 0; i < word.length(); i++) {
            int j = i;
            int charcount = 0;
            boolean[] check = new boolean[26];
            while (j < word.length() && vowels.contains(word.charAt(j))) {
                if (!check[word.charAt(j) - 'a']) {
                    check[word.charAt(j) - 'a'] = true;
                    charcount++;
                }
                if (charcount == 5) {
                    count++;
                }
                j++;
            }
        }
        
        return count;
    }
}
                   
                   