class Solution {
    public String intToRoman(int num) {
        StringBuilder numeral = new StringBuilder();
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] numerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int i = 0;
        while (num > 0) {
            while (numbers[i] > num) {
                i++;
            }
            numeral.append(numerals[i]);
            num -= numbers[i];
            
        }
        
        return numeral.toString();
    }
}