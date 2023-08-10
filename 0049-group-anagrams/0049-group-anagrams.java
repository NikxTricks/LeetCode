class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> data = new HashMap<>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!data.containsKey(sorted)) {
                data.put(sorted, new LinkedList<String>());
            }
                data.get(sorted).add(str);

        }
        
        return new LinkedList<List<String>>(data.values());
    }
}