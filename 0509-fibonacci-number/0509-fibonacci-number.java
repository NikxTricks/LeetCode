class Solution {
    HashMap<Integer, Integer> data = new HashMap<>();
    public int fib(int n) {
        return helper(n);
    }
    
    public int helper(int n) {
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        if (!data.containsKey(n - 1)) {
            data.put(n - 1, helper(n - 1));
        }
        if (!data.containsKey(n - 2)) {
            data.put(n - 2, helper(n - 2));
        }
        return data.get(n - 1) + data.get(n - 2);
        
        
    }
}