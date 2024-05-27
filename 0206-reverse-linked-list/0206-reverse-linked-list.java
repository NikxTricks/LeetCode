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
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        
        while (cur.next != null) {
            ListNode temp = head;
            head = cur.next;
            cur.next = head.next;
            head.next = temp;
        }
        
        return head;
    }
}