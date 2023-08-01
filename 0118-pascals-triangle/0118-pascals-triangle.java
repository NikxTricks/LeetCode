import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> out = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            List<Integer> temp = new ArrayList<>(row + 1);
            for (int col = 0; col <= row; col++) {
               if (col == 0 || col == row) {
                   temp.add(1);
               } 
                else {
                temp.add(out.get(row - 1).get(col - 1) + out.get(row - 1).get(col));
                }

            }
            
            out.add(temp);
        }
        return out;
    }
}