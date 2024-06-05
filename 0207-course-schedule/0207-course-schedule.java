class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] data = new int[numCourses];
        for (int[] prereq: prerequisites) {
            data[prereq[1]]++;
        }
        Queue<Integer> order = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (data[i] == 0) {
                order.add(i);
            }
        }
        while (order.size() > 0) {
                int cur = order.remove();
                    for (int[] prereq: prerequisites) {
                        if (prereq[0] == cur) {
                            data[prereq[1]]--;
                            if (data[prereq[1]] == 0) {
                               order.add(prereq[1]); 
                            }
                        }
                    }  
                    numCourses--;
            }
        if (numCourses != 0) {
            return false;
        }
        
        return true;


    }
    
}