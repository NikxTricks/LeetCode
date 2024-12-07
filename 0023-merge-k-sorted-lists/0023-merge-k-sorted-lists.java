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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> order = new PriorityQueue<>((a, b) -> a.val - b.val);

        
        for (ListNode list: lists) {
            if (list != null) {
                order.add(list);
            }
        }
        
        
        ListNode out = new ListNode(0);
        ListNode head = out;
        while (!order.isEmpty()) {
            ListNode cur = order.remove();
            out.next = cur;
            out = out.next;
            cur = cur.next;
            if (cur != null) {
                order.add(cur);
            }
            
        }
        
        
        return head.next;
    }
}