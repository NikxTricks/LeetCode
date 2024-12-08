class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        List<List<String>> merged = new ArrayList<>();
        Map<String, String> parents = new HashMap<>();
        Map<String, String> emailToName = new HashMap<>();
        
        for (List<String> account: accounts) {
            String name = account.get(0);
            String email = account.get(1);
            for (int i = 1; i < account.size(); i++) {
                emailToName.put(account.get(i), name);
                parents.putIfAbsent(account.get(i), email);
                union(email, account.get(i), parents);
            }
        }
        
        
        Map<String, List<String>> mergedemails = new HashMap<>();
        
        for (Map.Entry<String, String> e: emailToName.entrySet()) {
            String email = e.getKey();
            String root = find(email, parents);
            mergedemails.putIfAbsent(root, new ArrayList<>());
            mergedemails.get(root).add(email);
        }
        
        for (List<String> emails: mergedemails.values()) {
            Collections.sort(emails);
            emails.add(0, emailToName.get(emails.get(0)));
            merged.add(emails);
        }
        
       return merged;
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
        
        if (!parenta.equals(parentb)) {
            parents.put(parenta, parentb); // Union by root
        }
    }
}