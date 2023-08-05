class Solution {
    public List<List<Integer>> findMissingRanges(int[] nums, int lower, int upper) {
        List<List<Integer>> out = new LinkedList<>();
        List<Integer> bucket = new LinkedList<>();
        if (nums.length == 0) {
            bucket.add(lower);
            bucket.add(upper);
            out.add(bucket);
            return out;
        }
        if (lower + 1 <= nums[0]) {
            bucket.add(lower);
            bucket.add(nums[0] - 1);
            out.add(bucket);
            bucket = new LinkedList<>();
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 != nums[i + 1]) {
                bucket.add(nums[i] + 1);
                bucket.add(nums[i + 1] - 1);
                out.add(bucket);
                bucket = new LinkedList<>();
            }
        }
        if (nums[nums.length - 1] + 1 <= upper) {
            bucket.add(nums[nums.length - 1] + 1);
            bucket.add(upper);
            out.add(bucket);
        }
        return out;
    }
}