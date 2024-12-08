//import java.util.Random;
class Solution {
    int prefixSum[];
    Random r;
    public Solution(int[] w) {
        int sum = 0;
        prefixSum = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            prefixSum[i] = sum;
        }
        r = new Random();
    }
    
    public int pickIndex() {
        int pick = r.nextInt(prefixSum[prefixSum.length - 1]);
        for (int i = 0; i < prefixSum.length; i++) {
            if (pick < prefixSum[i]) {
                return i;
            }
        }
        
        return -1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */