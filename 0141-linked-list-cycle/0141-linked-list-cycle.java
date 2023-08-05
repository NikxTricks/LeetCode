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
        HashSet<ListNode> track = new HashSet<>();
        
        ListNode cur1 = head;
        ListNode cur2 = head;
        while (cur2 != null && cur2.next != null && cur2.next.next != null) {
            if (track.contains(cur2)) {
                return true;
            }
        
            track.add(cur1);
            cur1 = cur1.next;
            cur2 = cur2.next.next.next;
        }
        
        return false;
    }
}