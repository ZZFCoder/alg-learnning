package learning.zhao.list;

public class Q19 {
    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode h1 = head;
            ListNode h2 = head;
            int i = 0;
            while (h1 != null) {
                if (i++ >= n + 1) {
                    h2 = h2.next;
                }
                h1 = h1.next;
            }

            if (i == n) {
                return head.next;
            }

            h2.next = h2.next.next;
            return head;
        }
    }
}
