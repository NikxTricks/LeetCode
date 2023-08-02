import java.util.Set;
class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashSet<Integer> data = new HashSet<>();
        for (int num: nums) {
            if (data.remove(num)) {
                return true;
            }
            data.add(num);
        }
        
        return false;
    }
}