package learning.zhao.list;

public class Q83 {
    static class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode node = new ListNode(1000);
            node.next = head;
            ListNode slow = node, fast = head;
            while(fast != null) {
                if (slow.val == fast.val) {
                    fast = fast.next;
                    slow.next = fast;
                }
                else {
                    fast = fast.next;
                    slow = slow.next;
                }
            }
            return node.next;
        }
    }
}
