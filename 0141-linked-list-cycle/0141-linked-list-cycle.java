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
        
        ListNode cur = head;
        while (cur != null) {
            if (track.contains(cur)) {
                return true;
            }
        
            track.add(cur);
            cur = cur.next;
        }
        
        return false;
    }
}