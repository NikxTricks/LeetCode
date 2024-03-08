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
        
        List<Integer> nums = new LinkedList<>(numerals.keySet());
        Collections.sort(nums, Collections.reverseOrder());
        
        
        while (num > 0) {
            int i = 0;
            while (nums.get(i) > num) {
                //System.out.println("Current check: " + nums.get(i));
                i++;
            }
            int sub = nums.get(i);
            numeral += numerals.get(sub);
            num -= sub;
            //System.out.println("Current num: " + num);
            
        }
        
        return numeral;
    }
}