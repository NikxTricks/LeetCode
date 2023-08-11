class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int front = 0;
    int back = numbers.length - 1;
    while (front < back) {
        if (numbers[front] + numbers[back] > target) {
            back--;
        }
        else if (numbers[front] + numbers[back] < target) {
            front++;
        }
        else {
            return new int[] {front + 1, back + 1};
        }

    }
        
        
        return new int[2];
        
    }
    
 
}