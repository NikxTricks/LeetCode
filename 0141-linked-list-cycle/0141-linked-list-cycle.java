/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode cur1 = head;
        ListNode cur2 = head;
        while (cur2 != null && cur2.next != null && cur2.next.next != null) {
            cur1 = cur1.next;
            cur2 = cur2.next.next;
            if (cur1 == cur2) {
                return true;
            }
        }
        
        return false;
    }
}