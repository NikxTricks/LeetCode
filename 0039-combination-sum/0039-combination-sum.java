class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new LinkedList<>();
        List<Integer> cur = new LinkedList<>();
        helper(candidates, target, 0, out, cur);
        return out;
        
    }
    
    public void helper(int[] candidates, int target, int sum, List<List<Integer>> out, List<Integer> cur) {
        if (sum == target) {
            List<Integer> temp = new LinkedList<>(cur);
            Collections.sort(temp);
            if (!out.contains(temp)) {
                out.add(temp); 
            }
        }
        if (sum > target) {
            return;   
        }
        
        for (int i = 0; i < candidates.length; i++) {
            cur.add(candidates[i]);
            helper(candidates, target, sum + candidates[i], out, cur);
            cur.remove(cur.size() - 1);
        }
        
    }
}