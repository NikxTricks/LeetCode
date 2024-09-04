class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a = new StringBuilder(s);
        StringBuilder b = new StringBuilder(t);
        
        for (int i =  0; i < a.length(); i++) {
            if (a.charAt(i) == '#') {
                a.deleteCharAt(i);
                if (i >= 1) {
                    a.deleteCharAt(i - 1);
                    i--;
                }
                i--;
            }
        }
        for (int i =  0; i < b.length(); i++) {
            if (b.charAt(i) == '#') {
                b.deleteCharAt(i);
                if (i >= 1) {
                    b.deleteCharAt(i - 1);
                    i--;
                }
                i--;
            }
        }
        
        String outA = a.toString();
        String outB = b.toString();
        return outA.equals(outB);
    }
}