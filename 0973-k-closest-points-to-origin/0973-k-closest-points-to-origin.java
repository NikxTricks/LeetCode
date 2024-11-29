class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> order = new PriorityQueue<int[]>((a, b) -> {
            return Double.compare(b[0] * b[0] + b[1] * b[1], a[0] * a[0] + a[1] * a[1]);
        });
        
        for (int[] point: points) {
            order.add(point);
            if (order.size() > k) {
                order.remove();
            }   
        }
        int[][] out = new int[order.size()][2];
        
        for (int i = 0; i < k; i++) {
            out[i] = order.remove();
        }
        
        return out;
        
        
    }
    
}


class Pair {
    int[] point;
    double dist;
    
    
    public Pair(int[] point, double dist) {
        this.point = point;
        this.dist = dist;
    }
}