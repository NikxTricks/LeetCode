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

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        
        int count = 1;
        
        while (count < n) {
            if (cur2 == null) {
                head = head.next;
                return head;
            }
            cur2 = cur2.next;
            count++;
        }
        
        while (cur2.next != null && cur2.next.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
        if (cur1 == head && cur2.next == null) {
            head = head.next;
        }
        else if (cur1 == head) {
            head.next = head.next.next;
        }
        else {
            cur1.next = cur1.next.next;
        }
        
        return head;
    }
}