import java.util.Set;
class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> data = new HashSet<>((nums.length - 1)/2 + 1);
        for (int num: nums) {
            if (data.remove(num)) {
                continue;
            }
            else {
                data.add(num);
            }
        }
        int result = -1;
        for (Integer num: data) {
            result = num;
        }
        return result;
    }
}