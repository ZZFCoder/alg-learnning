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

    static class Solution2 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode ahead = new ListNode();
            ahead.next = head;
            ListNode loop1 = ahead;
            ListNode loop2 = ahead;
            int i = 0;
            while(loop1 != null) {
                loop1 = loop1.next;
                if (i > n) {
                    loop2 = loop2.next;
                }
                i++;
            }

            if (loop2.next != null) {
                loop2.next = loop2.next.next;
            }

            return ahead.next;
        }
    }
}
