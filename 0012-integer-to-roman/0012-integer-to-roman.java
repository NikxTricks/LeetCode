class Solution {
    public String intToRoman(int num) {
        String numeral = "";
        HashMap<Integer, String> numerals = new HashMap<>();
        numerals.put(1000, "M");
        numerals.put(900, "CM");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100, "C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(40, "XL");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5, "V");
        numerals.put(4, "IV");
        numerals.put(1, "I");
        
        List<Integer> nums = new ArrayList<>();
        nums.add(1000);
        nums.add(900);
        nums.add(500);
        nums.add(400);
        nums.add(100);
        nums.add(90);
        nums.add(50);
        nums.add(40);
        nums.add(10);
        nums.add(9);
        nums.add(5);
        nums.add(4);
        nums.add(1);
        
        int i = 0;
        int cur = 1000;
        while (num > 0) {
            while (cur > num) {
                cur = nums.get(++i);
            }
            numeral += numerals.get(cur);
            num -= cur;
            
        }
        
        return numeral;
    }
}