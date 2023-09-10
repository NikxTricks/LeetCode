class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(candidates, target, 0, 0, out, cur);
        return out;
        
    }
    
    public void helper(int[] candidates, int target, int sum, int start, List<List<Integer>> out, List<Integer> cur) {
        if (sum == target) {
                out.add(new LinkedList<>(cur));
        }
        if (sum > target) {
            return;   
        }
        
        for (int i = start; i < candidates.length; i++) {
            cur.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], i, out, cur);
            cur.remove(cur.size() - 1);
        }
        
    }
}