class Solution {
    public long minimumHealth(int[] damage, int armor) {
        long minHealth = 0;
        
        long max = 0;
        for (long d: damage) {
            minHealth += d;
            max = Math.max(d, max);
        }
        
        minHealth -= Math.min(armor, max);
        
        return minHealth + 1;
    }
}