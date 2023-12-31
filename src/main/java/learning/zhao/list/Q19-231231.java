class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode front = dummy,rear = dummy;
        for (int i = 0; i < n && front.next != null; i ++) {
            front = front.next;
        }
        
        while(front.next != null) {
            front = front.next;
            rear = rear.next;
        }

        rear.next = rear.next.next;
        return dummy.next;
    }
}