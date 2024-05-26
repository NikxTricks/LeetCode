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

        Stack<ListNode> reverse = new Stack<>();
        while (mid != null) {
            reverse.add(mid);
            mid = mid.next;
        }
        
        while (reverse.size() != 0) {
            ListNode tempCur = cur.next;
            cur.next = reverse.pop();
            cur.next.next = tempCur;
            cur = cur.next.next;
        }
    }
}