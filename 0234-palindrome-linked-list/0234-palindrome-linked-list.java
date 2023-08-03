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
        
        ListNode cur = head;
        int size = 0;
        Stack<Integer> reverse = new Stack<>();
        
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        
        int mid = size/2;
        
        cur = head;
        for (int i = 0;i < mid; i++) {
            reverse.push(cur.val);
            cur = cur.next;
        }
        
        if (size%2==1) {
            cur = cur.next;
        }
        
        while (cur != null) {
            if (reverse.pop() != cur.val) {
              return false;  
            }
            cur = cur.next;
        }
        
        
        return true;
        
        
    }
}