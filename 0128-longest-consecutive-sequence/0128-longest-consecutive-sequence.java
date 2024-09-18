class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;
        
        HashSet<Integer> data = new HashSet<>();

        for (int num: nums) {
            data.add(num);
        }
        
        
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            //check whether number can be the start of a sequence or already in a sequence
            if (data.contains(nums[i] - 1)) {
                continue;
            }
            int temp = nums[i];
            temp = nums[i];
            while (data.contains(++temp)) {
                count++;
                data.remove(temp);
            }
            
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}