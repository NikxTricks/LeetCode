class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> data = new HashMap<>();
        int[] out = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (data.containsKey(target - numbers[i])) {
                out[0]  = Math.min(i, data.get(target - numbers[i])) + 1;
                out[1] = Math.max(i, data.get(target - numbers[i])) + 1;
                return out;
            }
            else {
                data.put(numbers[i], i);
            }
        }
        
        return out;
    }
}