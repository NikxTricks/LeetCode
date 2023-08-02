import java.util.Set;
import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> data = new HashSet<>();
        for (int num: nums) {
            data.add(num);
        }
        
        for (int i = 0; i<= nums.length; i++) {
           if (!data.contains(i)) {
               return i;
           } 
        }
        return -1;
    }
}