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

        ListNode cur = head;
        int size = 0;
        
        while (cur != null) {
            cur = cur.next;
            size++;
        }
        
        if (n == size) {
            head = head.next;
            return head;
        }
        int count = 1;
        cur = head;
        while (count < size - n) {
            System.out.println(cur.val);
            cur = cur.next;
            count++;
        }
        
        cur.next = cur.next.next;
        return head;
    }
}