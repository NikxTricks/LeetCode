class Solution {
    String word;
    public boolean exist(char[][] board, String word) {
        this.word = word;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if (board[i][j] == word.charAt(0)) {
                   if (helper(board, i, j, 0)) {
                       return true;
                   }
               } 
            }
        }
        
        return false;
        
    }
    
    public boolean helper(char[][] board, int row, int col, int count) {
        if (board[row][col] == '!' || board[row][col] != word.charAt(count)) {
            return false;
        }
        if (count == word.length() - 1 && board[row][col] == word.charAt(count)) {
            return true;
        }
        char orig = board[row][col];
        board[row][col] = '!';

            if (row - 1 >= 0 && helper(board, row - 1, col, count + 1)) {
                    return true;
            }
            if (row + 1 < board.length && helper(board, row + 1, col, count + 1)) {
                    return true;
            }
            if (col + 1 < board[0].length && helper(board, row, col + 1, count + 1)) {
                    return true;
            }
            if (col - 1 >= 0 && helper(board, row, col - 1, count + 1)) {
                    return true;
            }
    
        board[row][col] = orig;
        return false;
        
        
        
    }
}