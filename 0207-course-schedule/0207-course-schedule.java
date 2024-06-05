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
        while (in.size() > 0 && in.containsValue(0)) {
            for (int i = 0; i < numCourses; i++) {
                int curVertexInDegree = in.getOrDefault(i, -1);
                if (curVertexInDegree == 0) {
                    System.out.println(i);
                    for (int[] prereq: prerequisites) {
                        if (prereq[0] == i) {
                            in.put(prereq[1], in.get(prereq[1]) - 1);
                        }
                    }  
                    in.remove(i);
                }
            }
            
        }
        
        if (in.size() > 0) {
                return false;  
        }
        
        return true;


    }
    
}