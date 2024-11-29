class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<double[]> order = new PriorityQueue<double[]>((a, b) -> {
            return Double.compare(b[2], a[2]);
        });
        
        for (int[] point: points) {
            double[] entry = new double[3];
            entry[0] = point[0];
            entry[1] = point[1];
            entry[2] = Math.sqrt(point[0] * point[0] + point[1] * point[1]);
            if (order.size() < k) {
                order.add(entry);
            }
            else if (order.peek()[2] > entry[2]) {
                order.remove();
                order.add(entry);
            }
        }
        
        int[][] out = new int[order.size()][2];
        int i = 0;
        while (!order.isEmpty()) {
            double[] entry = order.remove();
            out[i][0] = (int) entry[0];
            out[i][1] = (int) entry[1];
            i++;
        }
        
        return out;
        
        
    }
    
}


