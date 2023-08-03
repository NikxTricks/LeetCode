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
import java.util.Queue;

class Solution {
    public boolean isPalindrome(ListNode head) {
        
        ListNode cur = head;
        Stack<Integer> reverse = new Stack<>();
        Queue<Integer> normal = new LinkedList<>();
        while (cur != null) {
            reverse.push(cur.val);
            normal.add(cur.val);
            cur = cur.next;
        }
        
        
        while (reverse.size() != 0) {
            if (reverse.pop() != normal.remove()) {
                return false;
            }
        }
        return true;
    }
}