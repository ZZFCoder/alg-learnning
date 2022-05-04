package learning.zhao.list;

public class Q61 {
    static class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            ListNode slow = head, fast = head;
            int i = 0;
            //2, 0, 0++
            //3, 1, 1++
            //null, 2, 2++
            while (fast != null) {
                fast = fast.next;
                if (i < k && fast == null) {
                    fast = head;
                }

                if (i++ >= k + 1) {
                    slow = slow.next;
                }
            }

            if (slow == null || slow.next == null) {
                return head;
            }

            ListNode v = new ListNode();
            v.next = slow.next;
            slow.next = null;

            ListNode n = v.next;
            while(n.next != null) {
                n = n.next;
            }
            n.next = head;
            return v.next;
        }
    }
}
