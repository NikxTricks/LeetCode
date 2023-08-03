/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.Stack;

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        Stack<Integer> reverse = new Stack<>();
        
        while (fast.next != null &&  fast.next.next != null) {
            reverse.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        
        reverse.push(slow.val);
        
        if (fast.next == null) {
            reverse.pop();
        }
                    slow = slow.next;

        
        while (slow != null) {
            if (reverse.pop() != slow.val) {
                return false;
            }
            slow = slow.next;
        }
        

        
        
        return true;
        
        
    }
}