class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //HashMap<Integer, Integer> data = new HashMap<>();
        int[] out = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > target - numbers[i]) {
                continue;
            }
        
            int temp = Math.max(binarySearch(numbers, target - numbers[i], 0,i), binarySearch(numbers, target - numbers[i], i + 1, numbers.length - 1));
            System.out.println(temp);
            if (temp != -1) {
                out[0] = Math.min(temp, i) + 1;
                out[1] = Math.max(temp, i) + 1;
                return out;
            }
        }
        
        return out;
    }
    
    public int binarySearch(int[] numbers, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end)/2;
        if (numbers[mid] == target) {
            return mid;
        }
       if (numbers[mid] > target) {
            return binarySearch(numbers, target, start, mid - 1);
        }
        return binarySearch(numbers, target, mid + 1, end);
    }
}