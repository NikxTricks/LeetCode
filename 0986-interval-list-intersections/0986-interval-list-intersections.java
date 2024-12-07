class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
            //return new int[][]{{0, 0}};
        List<int[]> temp = new ArrayList<>();
        int i = 0;
        int j = 0;
        
        
        int[] cur = new int[2];
        while (i < firstList.length && j < secondList.length) {
            if (firstList[i][0] > secondList[j][1]) {
                j++;
            }
            else if (secondList[j][0] > firstList[i][1]) {
                i++;
            }
            else {
                cur[0] = Math.max(firstList[i][0], secondList[j][0]);
                cur[1] = Math.min(firstList[i][1], secondList[j][1]);
                temp.add(cur);
                cur = new int[2];
                if (firstList[i][1] > secondList[j][1]) {
                    j++;
                }
                else {
                    i++;
                }
            } 
        }
        
        return temp.toArray(new int[temp.size()][]);
    }
}