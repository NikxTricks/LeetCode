/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public int depthSum(List<NestedInteger> nestedList) {
        //return helper(nestedList, 1);
        Queue<Pair> order = new LinkedList<>();
        
        for (NestedInteger cur: nestedList) {
            order.add(new Pair(cur, 1));
        }
        
        int sum = 0;
        
        while (!order.isEmpty()) {
            Pair p = order.remove();
            if (p.cur.isInteger()) {
                sum += p.cur.getInteger() * p.curDepth;
            }
            else {
                for (NestedInteger cur: p.cur.getList()) {
                    order.add(new Pair(cur, p.curDepth + 1));
                }
            }
        }
        
        return sum;
    }
    
    private int helper(List<NestedInteger> nestedList, int depth) {
        int sum = 0;
        
        for (NestedInteger next: nestedList) {
            if (next.isInteger()) {
                sum += next.getInteger() * depth;
            }
            else {
                sum += helper(next.getList(), depth + 1);
            }
        }
        
        return sum;
    }
}

class Pair {
    NestedInteger cur;
    int curDepth;
    
    public Pair(NestedInteger cur, int curDepth) {
        this.cur = cur;
        this.curDepth = curDepth;
    }
}