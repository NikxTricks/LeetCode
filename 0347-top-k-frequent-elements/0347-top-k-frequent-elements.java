class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Map.Entry<Integer, Integer>> top = new PriorityQueue<>(
        (a, b) -> a.getValue().compareTo(b.getValue())
        );
        
        HashMap<Integer, Integer> freq = new HashMap<>();        
        for (int i = 0; i < nums.length; i++) {
                freq.put(nums[i], freq.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry: freq.entrySet()) {
           top.add(entry);
            if (top.size() > k) {
                top.remove();
            }
        }
        
        int[] out = new int[k];
        for (int i = 0; i < out.length; i++) {
            out[i] = top.remove().getKey();
        }
        return out;
    }
}