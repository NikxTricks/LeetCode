class Solution {
    HashSet<Integer> coords = new HashSet<>();
    public boolean exist(char[][] board, String word) {
        
        int m = board.length;
        int n = board[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               if (board[i][j] == word.charAt(0)) {
                   if (helper(board, word, i, j, 0)) {
                       return true;
                   }
               } 
            }
        }
        
        return false;
        
    }
    
    public boolean helper(char[][] board, String word, int row, int col, int count) {
        if (coords.contains(row * 10 + col) || board[row][col] != word.charAt(count)) {
            return false;
        }
        if (count == word.length() - 1 && board[row][col] == word.charAt(count)) {
            return true;
        }
        
        coords.add(row * 10 + col);

            if (row - 1 >= 0 && helper(board, word, row - 1, col, count + 1)) {
                    return true;
            }
            if (row + 1 < board.length && helper(board, word, row + 1, col, count + 1)) {
                    return true;
            }
            if (col + 1 < board[0].length && helper(board, word, row, col + 1, count + 1)) {
                    return true;
            }
            if (col - 1 >= 0 && helper(board, word, row, col - 1, count + 1)) {
                    return true;
            }
    
        
        coords.remove(row * 10 + col);
        return false;
        
        
        
    }
}