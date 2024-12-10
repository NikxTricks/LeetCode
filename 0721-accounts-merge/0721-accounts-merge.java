class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, String> emailToName = new HashMap<>();
        Map<String, String> parents = new HashMap<>();
        
        for (List<String> account: accounts) {
            String name = account.get(0);
            String parent = account.get(1);
            for (int i = 1; i < account.size(); i++) {
                parents.putIfAbsent(account.get(i), parent);
                emailToName.put(account.get(i), name);
                union(parent, account.get(i), parents);
            }
        }
        
        Map<String, List<String>> merged = new HashMap<>();
        
        for (String email: emailToName.keySet()) {
            String parent = find(email, parents);
            merged.putIfAbsent(parent, new ArrayList<>());
            merged.get(parent).add(email);
        }
        
        List<List<String>> out = new ArrayList<>();
        for (Map.Entry<String, List<String>> e: merged.entrySet()) {
            List<String> cur = e.getValue();
            Collections.sort(cur);
            cur.add(0, emailToName.get(cur.get(0)));
            out.add(cur);
        }
        
        return out;
    }
    
    private String find(String email, Map<String, String> parents) {
        if (!email.equals(parents.get(email))) {
            parents.put(email, find(parents.get(email), parents));
        }
        
        return parents.get(email);
    }
    
    private void union(String emaila, String emailb, Map<String, String> parents) {
        String parenta = find(emaila, parents);
        String parentb = find(emailb, parents);
        
        parents.put(parenta, parentb);
    }
}