//import java.util.Random;
class Solution {
    int nums[];
    Random r;
    public Solution(int[] w) {
        int sum = 0;
        nums = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            sum += w[i];
            nums[i] = sum;
        }
        r = new Random();
    }
    
    public int pickIndex() {
        int pick = r.nextInt(nums[nums.length - 1]) + 1;
        
       int lo = 0, hi = this.nums.length - 1;
       while (lo < hi) {
           int mid = lo + (hi - lo) / 2;
           
           // pulled the exact value of an index
           if (this.nums[mid] == pick)
               return mid;
           else if (this.nums[mid] < pick)
               lo = mid + 1;
           else
               hi = mid; // find the leftmost value incase two of the indexes are the same and one is zero
       }
       return lo;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */