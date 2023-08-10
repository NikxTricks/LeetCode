class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> data = new HashMap<>();
        List<List<String>> out = new LinkedList<>();
        List<String> temp;
        int[] chars;
        String sorted = "";
        
        for (String str: strs) {
            sorted = "";
            chars = new int[str.length()];
            for (int i = 0; i < str.length(); i++) {
                chars[i] = (int) str.charAt(i);
            }
            Arrays.sort(chars);
            for (int c: chars) {
                sorted = sorted + ((char) c);
            }
            if (data.containsKey(sorted)) {
                data.get(sorted).add(str);
            }
            else {
                temp = new LinkedList<>();
                temp.add(str);
                data.put(sorted,temp);
            }
        }
        
        for (String key: data.keySet()) {
            out.add(data.get(key));
        }
        
        return out;
    }
}