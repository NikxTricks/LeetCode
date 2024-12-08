class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        
        for (int i = n - 1; i >= 0; i--) {
            int ir = i;
            int ic = 0;
            int s = matrix[ir][ic];
            while (ir < n && ic < m) {
                if (matrix[ir][ic] != s) {
                    return false;
                }
                ir++;
                ic++;
            }
        }
        
        //[[11,74,0,93],
        //[40,11,74,7]]
        //
        
        for (int i = 0; i < m; i++) {
            int ir = 0;
            int ic = i;
            int s = matrix[ir][ic];
            //System.out.println(s);
            while (ir < n && ic < m) {
                if (matrix[ir][ic] != s) {
                    return false;
                }
                ir++;
                ic++;
            }
        }
        
        return true;
    }
}