class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int start = 0;
        int temp;
        while (start < n) {
            for (int i = start; i < n - 1; i++) {
                temp = matrix[start][i];
                matrix[start][i] = matrix[n - 1 - (i - start)][start];
                matrix[n - 1 - (i - start)][start] = matrix[n - 1][n - 1 - (i - start)];
                matrix[n - 1][n - 1 - (i - start)] = matrix[i][n - 1];
                matrix[i][n - 1] = temp;
        }
        
        start++;
        n--;
        }
    }
}