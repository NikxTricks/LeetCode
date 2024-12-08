class Solution {
    public int maximumSwap(int num) {
        char[] digits = String.valueOf(num).toCharArray();
        
        
        
        int[] data = new int[2];
        int maxidx = digits.length - 1;
        int idxr = -1;
        int i = digits.length - 2;
        
        while (i >= 0) {
            int digit = digits[i] - '0';
            if (digit > digits[maxidx] - '0') {
                maxidx = i;
            }
            else if (digits[maxidx] - '0' > digit) {
                idxr = i;
                data[0] = idxr;
                data[1] = maxidx;
            }
            i--;  
        }
        
        if (idxr == -1) {
            return num;
        }
        
        
        char temp = digits[data[0]];
        digits[data[0]] = digits[data[1]];
        digits[data[1]] = temp;
        
        return Integer.valueOf(new String(digits));
        
    }
}