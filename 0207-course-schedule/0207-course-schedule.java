class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] data = new int[numCourses];
        HashMap<Integer, Integer> in = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            in.put(i, 0);
        }
        for (int[] prereq: prerequisites) {
            in.put(prereq[1], in.get(prereq[1]) + 1);
        }
        Queue<Integer> order = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (in.get(i) == 0) {
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