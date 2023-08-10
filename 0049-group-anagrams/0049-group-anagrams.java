class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> data = new HashMap<>();
        for (String str: strs) {
            String sorted = "";
            int[] chars = new int[str.length()];
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
                List<String> temp = new LinkedList<>();
                temp.add(str);
                data.put(sorted, temp);
            }
        }
        
        List<List<String>> out = new LinkedList<>(data.values());
        
        return out;
    }
}