class Solution {
    public int[] twoSum(int[] numbers, int target) {
    int front = 0;
    int back = numbers.length - 1;
    while (numbers[front] + numbers[back] != target) {
        if (numbers[front] + numbers[back] > target) {
            back--;
        }
        else {
            front++;
        }

    }
        
        
    return new int[] {front + 1, back + 1};

        
    }
    
 
}