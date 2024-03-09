class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int length = 0;
        int temp = x;
        while (temp > 0) {
            temp /= 10;
            length++;
        }
        char[] chars = new char[length];
        for (int i = 0; i < length; i++) {
            chars[i] = (char) (x%10);
            x /=10;
        }
        int i = 0;
        int j = length - 1;
        while (i < j) {
            //System.out.println(chars[i]);
            //System.out.println(chars[j]);
            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }
        
        return true;
        
    }
}