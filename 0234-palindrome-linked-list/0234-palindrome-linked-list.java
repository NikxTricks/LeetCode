class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode cur = head;

        Deque<Integer> data = new ArrayDeque<>();


        while (cur != null) {
            data.addLast(cur.val);
            cur = cur.next;
        }

        while (data.size() != 0) {
            if (data.size() == 1) {
                return true;
            }
            if (data.removeFirst() != data.removeLast()) {
                return false;
                
                            }
           
        }


        return true;
            }
}
