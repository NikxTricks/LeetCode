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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode out = null;
        ListNode fin = null;
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        if (cur1 == null && cur2 == null) {
            return fin;
        }
        if (cur2 == null) {
            return cur1;
        }
        if (cur1 == null) {
            return cur2;
        }
        if (cur1.val > cur2.val) {
                out = cur2;    
                cur2 = cur2.next;
        }
        else {
            out = cur1;
            cur1 = cur1.next;
        }
        fin = out;
        while (cur1 != null && cur2 != null) {
            if (cur1.val > cur2.val) {
                out.next = cur2;
                out = out.next;
                cur2 = cur2.next;
                
            }
            else {
                out.next = cur1;
                out = out.next;
                cur1 = cur1.next;
            }
        }
        if (cur1 == null) {
           out.next = cur2; 
        }
        if (cur2 == null) {
            out.next = cur1;
        }
        
        return fin;
        
    }
}