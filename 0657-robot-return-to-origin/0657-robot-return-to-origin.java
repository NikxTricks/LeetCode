class Solution {
    public boolean judgeCircle(String moves) {
        int vert = 0;
        int horizontal = 0;
        
        for (char move: moves.toCharArray()) {
            if (move == 'R') {
                horizontal++;
            }
            else if (move == 'L') {
                horizontal--;
            }
            else if (move == 'U') {
                vert++;
            }
            else {
                vert--;
            }
        }
        
        return horizontal == 0 && vert == 0;
    }
}