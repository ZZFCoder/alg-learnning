package learning.zhao.list;

public class Q876 {
    static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode fast = head, slow = head;
            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }
}
