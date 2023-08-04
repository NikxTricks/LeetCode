import java.util.HashMap;
class Solution {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> data = new HashMap<>();
        return getStairs(n, data);
    }
    
    public int getStairs(int n, HashMap<Integer, Integer> data) {
        if (n < 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int result = data.getOrDefault(n, -1);
        if (result == -1) {
            result = getStairs(n - 1, data) + getStairs(n - 2, data);
            data.put(n, result);
        } 
        return result;
    }
}