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
        if (list1 == null && list2 == null) {
            return fin;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1 == null) {
            return list2;
        }
        if (list1.val > list2.val) {
                out = list2;    
                list2 = list2.next;
        }
        else {
            out = list1;
            list1 = list1.next;
        }
        fin = out;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                out.next = list2;
                out = out.next;
                list2 = list2.next;
                
            }
            else {
                out.next = list1;
                out = out.next;
                list1 = list1.next;
            }
        }
        if (list1 == null) {
           out.next = list2; 
        }
        if (list2 == null) {
            out.next = list1;
        }
        
        return fin;
        
    }
}