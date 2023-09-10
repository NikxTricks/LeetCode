class Solution {

    public boolean exist(char[][] board, String word) {
        
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
               if (board[i][j] == word.charAt(0)) {
                   if (helper(board, new boolean[board.length][board[0].length], word, i, j, 0)) {
                       return true;
                   }
               } 
            }
        }
        
        return false;
        
    }
    
    public boolean helper(char[][] board, boolean[][] coords, String word, int row, int col, int count) {
        if (coords[row][col] || board[row][col] != word.charAt(count)) {
            return false;
        }
        if (count == word.length() - 1 && board[row][col] == word.charAt(count)) {
            return true;
        }
        
        coords[row][col] = true;

            if (row - 1 >= 0 && helper(board, coords, word, row - 1, col, count + 1)) {
                    return true;
            }
            if (row + 1 < board.length && helper(board, coords, word, row + 1, col, count + 1)) {
                    return true;
            }
            if (col + 1 < board[0].length && helper(board, coords, word, row, col + 1, count + 1)) {
                    return true;
            }
            if (col - 1 >= 0 && helper(board, coords, word, row, col - 1, count + 1)) {
                    return true;
            }
    
        coords[row][col] = false;
        return false;
        
        
        
    }
}