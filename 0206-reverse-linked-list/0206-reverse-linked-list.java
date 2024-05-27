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
        
        ListNode tail = head;
        
        while (tail.next != null) {
            ListNode temp = head;
            head = tail.next;
            tail.next = head.next;
            head.next = temp;
        }
        
        return head;
    }
}