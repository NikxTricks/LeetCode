class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, Integer> in = new HashMap<>();
        for (int[] prereq: prerequisites) {
            in.put(prereq[1], in.getOrDefault(prereq[1], 0) + 1);
        }
        Queue<Integer> order = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (in.getOrDefault(i, 0) == 0) {
                order.add(i);
            }
        }
        while (order.size() > 0) {
                int cur = order.remove();
                    for (int[] prereq: prerequisites) {
                        if (prereq[0] == cur) {
                            int deg = in.get(prereq[1]) - 1;
                            in.put(prereq[1], deg);
                            if (deg == 0) {
                               order.add(prereq[1]); 
                            }
                        }
                    }  
                    in.remove(cur);
            }
        if (in.size() > 0) {
                return false;  
        }
        
        return true;


    }
    
}