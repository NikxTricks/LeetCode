class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> order = new PriorityQueue<Pair>((a, b) -> {
            return Double.compare(b.dist, a.dist);
        });
        
        for (int[] point: points) {
            Pair entry = new Pair(point, point[0] * point[0] + point[1] * point[1]);
            if (order.size() < k) {
                order.add(entry);
            }
            else if (order.peek().dist > entry.dist) {
                order.remove();
                order.add(entry);
            }
            
        }
        int[][] out = new int[order.size()][2];
        int i = 0;
        while (!order.isEmpty()) {
            out[i] = order.remove().point;
            i++;
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