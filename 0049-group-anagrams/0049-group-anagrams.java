class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> data = new HashMap<>();
        for (String str: strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (data.containsKey(sorted)) {
                data.get(sorted).add(str);
            }
            else {
                List<String> temp = new LinkedList<>();
                temp.add(str);
                data.put(sorted, temp);
            }
        }
        
        return new LinkedList<List<String>>(data.values());
    }
}