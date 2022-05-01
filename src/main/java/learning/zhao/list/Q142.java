package learning.zhao.list;

public class Q142 {
    static class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode fast = head, slow = head;
            ListNode ret;
            while(fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;

                if (slow == fast) {
                    break;
                }
            }

            if (fast == null || fast.next == null) {
                return null;
            }

            slow = head;
            while (slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }
}
