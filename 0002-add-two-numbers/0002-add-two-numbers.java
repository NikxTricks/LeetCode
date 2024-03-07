/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

import java.util.LinkedList;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry = 0;
        int sum = 0;
        int digit = 0;
        while (cur1 != null && cur2 != null) {
            carry = 0;
            sum = 0;
            sum = cur1.val + cur2.val + cur.val;
            digit = sum%10;
            carry = sum/10;
            cur.val = digit;
            cur1 = cur1.next;
            cur2 = cur2.next;
            if (carry > 0 || cur1 != null || cur2 != null) {
                cur.next = new ListNode(carry);
                cur = cur.next;
            }
        }
        while (cur1 != null) {
            carry = 0;
            sum = 0;
            sum = cur1.val + cur.val;
            digit = sum%10;
            carry = sum/10;
            cur.val = digit;
            cur1 = cur1.next;
            if (carry > 0 || cur1 != null) {
                cur.next = new ListNode(carry);
                cur = cur.next;
            }
        }
        while (cur2 != null) {
            carry = 0;
            sum = 0;
            sum = cur2.val + cur.val;
            digit = sum%10;
            carry = sum/10;
            cur.val = digit;
            cur2 = cur2.next;
            if (carry > 0 || cur2 != null) {
                cur.next = new ListNode(carry);
                cur = cur.next;
            }
        }
        
        return head;
    }

}