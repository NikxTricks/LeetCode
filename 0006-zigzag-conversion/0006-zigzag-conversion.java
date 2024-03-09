class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        int gap = 2 * numRows - 2; //decrements by 2 each time
        StringBuilder out = new StringBuilder();
        
        int cur = gap;
        int move = cur;
        for (int i = 0; i < numRows; i++) {
            //System.out.println("Row: " + i);
            if (cur == 0) {
                cur = gap;
            }
            int j = 0;
            move = cur;
            while (i + j < s.length()) {
                out.append(String.valueOf(s.charAt(i + j)));
                //System.out.println("Added: " + (i + j));
                j += move;
                if (cur != gap) {
                    move = gap - move;
                }
                
            }
            cur -= 2;
            
        }
        
        return out.toString();
    }
}