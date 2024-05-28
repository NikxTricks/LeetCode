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
        ListNode mid = head;
        
        while (mid.next != null && mid.next.next != null) {
            cur = cur.next;
            mid = mid.next.next;
        }
        
        mid = cur.next;
        cur.next = null;
        cur = head;

        
        ListNode tail = mid;
        
        if (tail == null) {
            return;
        }
        
        while (tail.next != null) {
            ListNode temp = mid;
            mid = tail.next;
            tail.next = mid.next;
            mid.next = temp;
        }
        
        while (mid != null) {
            ListNode tempCur = cur.next;
            cur.next = mid;
            mid = mid.next;
            cur.next.next = tempCur;
            cur = cur.next.next;
        }
    }
}