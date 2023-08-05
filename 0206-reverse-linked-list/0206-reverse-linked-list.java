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
        ListNode slow = head;
        Stack<Integer> reverse = new Stack<>();
        while (slow != null) {
            reverse.add(slow.val);
            slow = slow.next;
        }
        slow = head;
        
        while (slow != null) {
            slow.val = reverse.pop();
            slow = slow.next;
        }
        return head;
    }
}