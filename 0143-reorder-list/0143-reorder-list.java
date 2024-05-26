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
    public void reorderList(ListNode head) {
        ListNode cur = head;
        ListNode pointer;
        
        while (cur.next != null && cur.next.next != null) {
            pointer = cur;
            while (pointer.next.next != null) {
               pointer = pointer.next;
            }
            pointer.next.next = cur.next;
            cur.next = pointer.next;
            pointer.next = null;
            
            cur = cur.next.next;
        }
    }
}