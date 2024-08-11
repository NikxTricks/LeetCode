class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int colBeg = 0;
        int rowBeg = 0;
        int colEnd = matrix[0].length;
        int rowEnd = matrix.length;
        while (colBeg < colEnd && rowBeg < rowEnd) {
            for (int i = colBeg; i < colEnd; i++) {
                spiral.add(matrix[rowBeg][i]);
            }       
            rowBeg++;
            for (int i = rowBeg; i < rowEnd; i++) {
                spiral.add(matrix[i][colEnd - 1]);
            } 
            colEnd--;
            if (rowEnd > rowBeg) {
                for (int i = colEnd - 1; i >= colBeg; i--) {
                    spiral.add(matrix[rowEnd - 1][i]);
                }       
                rowEnd--; 
            }
            if (colEnd > colBeg) {
            for (int i = rowEnd - 1; i >= rowBeg; i--) {
                spiral.add(matrix[i][colBeg]);
            }       
                colBeg++;
            }
        }
        
        return spiral;
    }
}