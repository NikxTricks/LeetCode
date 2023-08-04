import java.lang.Math;
class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> done = new HashSet<>();
        int total = 0;
        int cur = n;
        try {
            while (total != 1) {
            total = 0;
            while (cur != 0) {
                total += (Math.pow(cur%10, 2));
                cur = cur/10;
                    }
                cur = total;
                if (done.contains(cur)) {
                    return false;
                }
                done.add(cur);
                }
        
            return true;
        
            }
        catch (Exception timeout) {
            return false;
        }
        }


    }
