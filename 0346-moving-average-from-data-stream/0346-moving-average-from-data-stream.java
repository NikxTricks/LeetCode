class MovingAverage {
    int sum = 0;
    int[] data;
    int i = 0;
    int len = 0;

    public MovingAverage(int size) {
        this.data = new int[size];
    }
    
    public double next(int val) {
        this.sum -= data[i];
        this.sum += val;
        
        data[i] = val;
        
        i += 1;
        i %= data.length;
        
        return sum / (double) Math.min(++len, data.length);
    }
}

/**
 * Your MovingAverage object will be instantiated and called as such:
 * MovingAverage obj = new MovingAverage(size);
 * double param_1 = obj.next(val);
 */