class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> data = new PriorityQueue<>(Collections.reverseOrder());

        for (int num: stones) {
            data.add(num);
        }
        while (data.size() != 1) {
            data.add(data.remove() - data.remove());
        }
        return data.peek();
        
    }
}