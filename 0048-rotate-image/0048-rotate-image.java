class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int start = 0;
        int temp;
        int tempNext;
        while (start < n) {
            for (int i = start; i < n - 1; i++) {
                temp = matrix[start][i];
                matrix[start][i] = matrix[n - 1 - (i - start)][start];
                matrix[n - 1 - (i - start)][start] = matrix[n - 1][n - 1 - (i - start)];
                matrix[n - 1][n - 1 - (i - start)] = matrix[i][n - 1];
                matrix[i][n - 1] = temp;
                
                
                
                /*
            temp = matrix[i][n - 1];
            matrix[i][n - 1] = matrix[start][i];
            
            tempNext = matrix[n - 1][n - 1 - (i - start)];
            matrix[n - 1][n - 1 - (i - start)] = temp;
            
            temp = matrix[n - 1 - (i - start)][start];
            matrix[n - 1 - (i - start)][start] = tempNext;
            
            matrix[start][i] = temp;
            */
        }
        
        start++;
        n--;
        }
    }
}