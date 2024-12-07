class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> temp = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < firstList.length && j < secondList.length) {
            // If there is an intersection
            if (firstList[i][0] <= secondList[j][1] && secondList[j][0] <= firstList[i][1]) {
                int[] cur = new int[2];
                cur[0] = Math.max(firstList[i][0], secondList[j][0]);
                cur[1] = Math.min(firstList[i][1], secondList[j][1]);
                temp.add(cur);
            }
            
            // Move the pointer for the interval that ends first
            if (firstList[i][1] < secondList[j][1]) {
                i++;
            } else {
                j++;
            }
        }
        
        return temp.toArray(new int[temp.size()][]);
    }
}
