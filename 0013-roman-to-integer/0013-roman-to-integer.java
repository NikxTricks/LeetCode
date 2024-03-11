class Solution {
    public int romanToInt(String s) {
        int decimal = 0;
        HashMap<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L',50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            int f = numbers.get(s.charAt(i));
            if (i < s.length() - 1 && numbers.get(s.charAt(i + 1)) > f) {
                decimal += numbers.get(s.charAt(i + 1)) - f;
                i++;
            }
            else {
                decimal += f;
            }

        }
        
        
        
        return decimal;
        }
    }
