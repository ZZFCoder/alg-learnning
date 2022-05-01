package learning.zhao.list;

public class Q141 {
    static class Solution {
        public boolean hasCycle(ListNode head) {
            ListNode fast = head, slow = head;
            boolean ret = false;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if(slow == fast) {
                    ret = true;
                    break;
                }
            }
            return ret;
        }
    }
}
