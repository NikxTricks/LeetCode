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
        if (lists.length == 0) {
            return null;
        }
        return helper(lists, 0, lists.length - 1);
    }
    
    private ListNode helper(ListNode[] lists, int start, int end) {
        if (start == end) {
            return lists[start];
        }
        ListNode i = helper(lists, start, (start + end) / 2);
        ListNode j = helper(lists, ((start + end) / 2) + 1, end);
        
        ListNode out = null;
        ListNode head = null;
        while (i != null && j != null) {
            //System.out.println(i.val);
            //System.out.println(j.val);
            if (i.val > j.val) {
                if (out == null) {
                    out = new ListNode(j.val);
                    head = out;
                }
                else {
                    out.next = new ListNode(j.val);
                    out = out.next;
                }
                j = j.next;
            }
            else {
                if (out == null) {
                    out = new ListNode(i.val);
                    head = out;
                }
                else {
                    out.next = new ListNode(i.val);
                    out = out.next;
                }
                i = i.next;
            }
            //System.out.println(out.val);
        }
        while (i != null) {
            if (out == null) {
                out = new ListNode(i.val);
                head = out;
            }
            else {
                out.next = new ListNode(i.val);
                out = out.next; 
            }
            i = i.next;  
        }
        while (j != null) {
            if (out == null) {
                out = new ListNode(j.val);
                head = out;
            }
            else {
                out.next = new ListNode(j.val);
                out = out.next; 
            }
            j = j.next;  
        }
        //out.next = null; //remove any loops
        
        return head;
    }
    
}