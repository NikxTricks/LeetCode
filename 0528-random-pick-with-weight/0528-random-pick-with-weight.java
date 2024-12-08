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
        int pick = r.nextInt(prefixSum[prefixSum.length - 1]) + 1;
            
        int l = 0;
        int h = prefixSum.length - 1;
        
        while (l < h) {
            int mid = l + (h - l) / 2;
            
            if (prefixSum[mid] == pick) {
                return mid;
            }
            if (prefixSum[mid] < pick) {
                l = mid + 1;
            }
            else {
                h = mid;
            }
            
        }
        
        return l;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */