class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        helper(candidates, target, 0, out, cur, 0);
        return out;
    }
    
    public void helper(int[] candidates, int target, int sum, List<List<Integer>> out, List<Integer> cur, int start) {
        if (sum == target) {
            out.add(new LinkedList<>(cur));
            return;
        }
        if (sum > target) {
            return;   
        }
        
        for (int i = start; i < candidates.length; i++) {
            cur.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], out, cur, i); // notice the last parameter
            cur.remove(cur.size() - 1);
        }
    }
}
