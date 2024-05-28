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
    ListNode head;
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        this.head = head;
        helper(head);
        head = this.head;
        return head;
        
    }
    
    public void helper(ListNode cur) {
        if (cur.next == null) {
            this.head = cur;
            return;
        }
        helper(cur.next);
        cur.next.next = cur;
        cur.next = null;
        
    }
}