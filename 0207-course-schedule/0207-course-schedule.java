class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] data = new int[numCourses];
        //int pointer = numCourses - 1;
        HashMap<Integer, Integer> in = new HashMap<>();
        for (int i = 0; i < numCourses; i++) {
            in.put(i, 0);
        }
        for (int[] prereq: prerequisites) {
            in.put(prereq[1], in.get(prereq[1]) + 1);
        }
        while (in.size() > 0 && in.containsValue(0)) {
            for (Integer key: in.keySet()) {
                int curVertexInDegree = in.get(key);
                if (curVertexInDegree == 0) {
                    System.out.println(key);
                    for (int[] prereq: prerequisites) {
                        if (prereq[0] == key) {
                            in.put(prereq[1], in.get(prereq[1]) - 1);
                        }
                    }  
                    in.remove(key);
                    break;
                }
            }
            
        }
        
        if (in.size() > 0) {
                return false;  
        }
        
        return true;


    }
    
}